package com.designPatters.Strategy;

import com.designPatters.TemplateMethod.State.StateThatGiveOneDiscountTemplate;

public class Approved extends StateThatGiveOneDiscountTemplate implements State {
    @Override
    public void applyExtraDiscount(Orcamento orcamento) {
        super.applyExtraDiscount(orcamento);
    }

    @Override
    protected void applyDiscount(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.02;
    }

    @Override
    public void approve(Orcamento orcamento) {
        throw new RuntimeException("Can't approve a approved budget");
    }

    @Override
    public void reprove(Orcamento orcamento) {
        throw new RuntimeException("Can't reprove a approved budget");
    }

    @Override
    public void conclude(Orcamento orcamento) {
        orcamento.state = new Concluded();
    }
}
