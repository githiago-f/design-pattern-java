package com.designPatters.Strategy;

import com.designPatters.TemplateMethod.State.StateThatGiveOneDiscountTemplate;

public class OnApproval extends StateThatGiveOneDiscountTemplate implements State {
    @Override
    public void applyExtraDiscount(Orcamento orcamento) {
        super.applyExtraDiscount(orcamento);
    }

    @Override
    protected void applyDiscount(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
    }

    @Override
    public void approve(Orcamento orcamento) {
        orcamento.state = new Approved();
    }

    @Override
    public void reprove(Orcamento orcamento) {
        orcamento.state = new Reproved();
    }

    @Override
    public void conclude(Orcamento orcamento) {
        throw new RuntimeException("Can't set on approval to concluded state.");
    }
}
