package com.designPatters.Strategy;

public interface State {
    void applyExtraDiscount(Orcamento orcamento);

    void approve(Orcamento orcamento);
    void reprove(Orcamento orcamento);
    void conclude(Orcamento orcamento);
}
