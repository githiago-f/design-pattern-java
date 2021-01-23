package com.designPatters.ChainOfResponsibility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    private Conta account;

    @Before
    public void up() {
        Calendar calendar = Calendar.getInstance();
        double saldo = 450.0;
        String titular = "Thiago Farias Dutra";

        account = new Conta(titular, saldo, calendar);
    }

    @After
    public void down() {
        account = null;
    }

    @Test
    @DisplayName("Should go negative")
    public void statusShouldGoNegative() {
        assertTrue(account.getAccountState() instanceof PositiveState);

        account.saca(460.00);
        assertTrue(account.getSaldo() < 0);
        assertTrue(account.getAccountState() instanceof NegativeState);
    }

    @Test
    @DisplayName("Should apply 95% of deposit if balance is negative")
    public void applyDepositPercentIfNegative() {
        account.saca(460.00);
        double oldValue = account.getSaldo();

        account.deposita(50.0);
        double nineTeenPercent = 50.0 * 0.95;

        double newValue = account.getSaldo();

        assertEquals(nineTeenPercent, (newValue - oldValue), 0.0);
    }
}
