package com.designPatters.Decorator.fraudDetect;

import com.designPatters.ChainOfResponsibility.Conta;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class CreationDateFilter extends Filter {
    public CreationDateFilter() {}
    public CreationDateFilter(Filter otherFilter) {
        super(otherFilter);
    }

    @Override
    public List<Conta> accountFilter(List<Conta> accounts) {
        final int currentMonth = Calendar.getInstance()
            .get(Calendar.MONTH);
        final int currentYear = Calendar.getInstance()
            .get(Calendar.YEAR);

        List<Conta> filteredAccounts = accounts.stream()
                .filter(account -> {
                    int month = account.getDataDeAbertura()
                        .get(Calendar.MONTH);

                    int year = account.getDataDeAbertura()
                            .get(Calendar.YEAR);

                    return month == currentMonth && year == currentYear;
                })
                .collect(Collectors.toList());

        filteredAccounts.addAll(applyOtherFilter(accounts));

        return filteredAccounts;
    }
}
