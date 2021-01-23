package com.designPatters.TemplateMethod.State;

import com.designPatters.Strategy.Orcamento;

public abstract class StateThatGiveOneDiscountTemplate {
    private boolean givenDiscount = false;

    protected void applyExtraDiscount(Orcamento orcamento) {
        if (!givenDiscount) {
            applyDiscount(orcamento);
            givenDiscount = true;
            return;
        }

        throw new RuntimeException("Discount already given");
    }

    protected abstract void applyDiscount(Orcamento orcamento);
}
