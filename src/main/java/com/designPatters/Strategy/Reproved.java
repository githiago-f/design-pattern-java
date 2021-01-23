package com.designPatters.Strategy;

public class Reproved implements State {
    @Override
    public void applyExtraDiscount(Orcamento orcamento) {
        throw new RuntimeException("Can't apply a discount to reproved budget");
    }

    @Override
    public void approve(Orcamento orcamento) {
        throw new RuntimeException("Can't approve a reproved budget");
    }

    @Override
    public void reprove(Orcamento orcamento) {
        throw new RuntimeException("Can't reprove a reproved budget");
    }

    @Override
    public void conclude(Orcamento orcamento) {
        orcamento.state = new Concluded();
    }
}
