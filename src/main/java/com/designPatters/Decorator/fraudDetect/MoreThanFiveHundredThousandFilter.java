package com.designPatters.Decorator.fraudDetect;

import com.designPatters.ChainOfResponsibility.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class MoreThanFiveHundredThousandFilter extends Filter {

    public MoreThanFiveHundredThousandFilter() {}
    public MoreThanFiveHundredThousandFilter(Filter otherFilter) {
        super(otherFilter);
    }

    @Override
    public List<Conta> accountFilter(List<Conta> accounts) {
        List<Conta> filteredAccounts = accounts.stream()
                .filter(account -> account.getSaldo() >= 500000.0)
                .collect(Collectors.toList());

        filteredAccounts.addAll(applyOtherFilter(accounts));

        return filteredAccounts;
    }
}
