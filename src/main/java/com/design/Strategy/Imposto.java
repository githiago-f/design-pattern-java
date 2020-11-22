package com.design.Strategy;

import java.util.Optional;

public abstract class Imposto {
    private final Optional<Imposto> outroImposto;

    public Imposto() {
        outroImposto = Optional.empty();
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = Optional.ofNullable(outroImposto);
    }

    public abstract double calcula(Orcamento orcamento);

    protected double calculaOutroImposto(Orcamento orcamento) {
        if(outroImposto.isEmpty()) return 0;
        return outroImposto.get().calcula(orcamento);
    }
}
