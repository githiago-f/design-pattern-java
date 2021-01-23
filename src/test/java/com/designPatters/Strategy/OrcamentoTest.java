package com.designPatters.Strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertTrue;

@DisplayName("# Orcamento")
public class OrcamentoTest {
    private Orcamento budget;

    @Before
    public void up() {
        budget = new Orcamento(500);
    }

    @After
    public void down() {
        budget = null;
        System.gc();
    }

    @Test
    @DisplayName("Should approve budget")
    public void shouldApproveBudget() {
        budget.approve();
        assertTrue(budget.getState() instanceof Approved);
    }

    @Test
    @DisplayName("Should approve and get budget's discount (not twice)")
    public void shouldApproveAndGetDiscountOfBudget() {
        double initialBalance = budget.getValor();

        budget.approve();
        budget.applyExtraDiscount();

        assertTrue(initialBalance > budget.getValor());

        Exception exception = assertThrows(
            RuntimeException.class,
            () -> budget.applyExtraDiscount()
        );

        assertEquals("Discount already given", exception.getMessage());
    }

    @Test
    @DisplayName("Should approve budget and run into exception when try to reprove it")
    public void shouldApproveAndNotReprove() {
        budget.approve();

        Exception exception = assertThrows(
            RuntimeException.class,
            () -> budget.reprove()
        );
        assertEquals("Can't reprove a approved budget", exception.getMessage());
        assertTrue(budget.getState() instanceof Approved);
    }
}
