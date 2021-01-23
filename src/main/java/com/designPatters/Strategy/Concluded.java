package com.designPatters.Strategy;

public class Concluded implements State {
    @Override
    public void applyExtraDiscount(Orcamento orcamento) {
        throw new RuntimeException("Can't apply a discount to concluded budget");
    }

    @Override
    public void approve(Orcamento orcamento) {
        throw new RuntimeException("Can't approve a concluded budget");
    }

    @Override
    public void reprove(Orcamento orcamento) {
        throw new RuntimeException("Can't reprove a concluded budget");
    }

    @Override
    public void conclude(Orcamento orcamento) {
        throw new RuntimeException("Can't conclude a concluded budget");
    }
}
