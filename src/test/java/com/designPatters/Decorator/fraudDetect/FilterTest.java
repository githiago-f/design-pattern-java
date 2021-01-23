package com.designPatters.Decorator.fraudDetect;

import com.designPatters.ChainOfResponsibility.Conta;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterTest {
    private final List<Conta> accounts = new ArrayList<>();

    @Before
    public void up() {
        for(int i = 0; i < 100; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.MONTH, Calendar.JANUARY);
            Conta account = new Conta(
            "User " + i,
            Math.floor(100 * Math.random()) + 50,
                calendar
            );
            accounts.add(account);
        }
        Conta account = new Conta(
            "User with more than 500000",
            500000,
            Calendar.getInstance()
        );
        accounts.add(account);
    }

    @After
    public void down() {
        List<Conta> contas = new ArrayList<>(accounts);
        accounts.removeAll(contas);
    }

    @Test
    @DisplayName("Should filter accounts with less than a hundred of balance")
    public void filterAccountByLessBalance() {
        Filter filter = new LessThanAHundredFilter();

        List<Conta> filtered = filter.accountFilter(accounts);

        List<Double> balances = filtered.stream()
                .map(Conta::getSaldo)
                .collect(Collectors.toList());

        assertThat(balances, not(contains(greaterThan(100.0))));
    }

    @Test
    @DisplayName("Should filter accounts with more than 500 thousand of balance")
    public void filterAccountByTooHighBalance() {
        Filter filter = new MoreThanFiveHundredThousandFilter();
        List<Conta> filtered = filter.accountFilter(accounts);

        List<Double> balances = filtered.stream()
                .map(Conta::getSaldo)
                .collect(Collectors.toList());

        assertThat(balances, not(contains(lessThan(500000.0))));
    }

    @Test
    @DisplayName("Should filter accounts created at this month")
    public void filterByMonthOfCreation() {
        Filter filter = new CreationDateFilter();
        List<Conta> filtered = filter.accountFilter(accounts);

        List<Integer> dates = filtered.stream()
                .map(account -> account.getDataDeAbertura().get(Calendar.MONTH))
                .collect(Collectors.toList());

        assertThat(dates,
            not(contains(
                not(equalTo(Calendar.getInstance().get(Calendar.MONTH)))
            ))
        );
    }

    @Test
    @DisplayName("Should filter accounts using filter by less than a hundred, " +
            "higher than 500 thousand and created at this month")
    public void compositionTest() {
        Filter lessThanAHundredFilter = new LessThanAHundredFilter();
        Filter moreThanFiveHundredThousandFilter = new MoreThanFiveHundredThousandFilter(lessThanAHundredFilter);
        Filter creationDateFilter = new CreationDateFilter(moreThanFiveHundredThousandFilter);

        List<Conta> filteredAccounts = creationDateFilter.accountFilter(accounts);

        List<String> userNames = filteredAccounts.stream()
                .map(Conta::getTitular)
                .collect(Collectors.toList());

        System.out.println(userNames);
    }
}
