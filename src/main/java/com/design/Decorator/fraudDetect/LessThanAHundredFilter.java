package com.design.Decorator.fraudDetect;

import com.design.ChainOfResponsibility.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class LessThanAHundredFilter extends Filter {

    public LessThanAHundredFilter() {}
    public LessThanAHundredFilter(Filter otherFilter) {
        super(otherFilter);
    }

    @Override
    public List<Conta> accountFilter(List<Conta> accounts) {
        List<Conta> filteredAccounts = accounts.stream()
                .filter(account -> account.getSaldo() < 100.0)
                .collect(Collectors.toList());

        filteredAccounts.addAll(applyOtherFilter(accounts));

        return filteredAccounts;
    }
}
