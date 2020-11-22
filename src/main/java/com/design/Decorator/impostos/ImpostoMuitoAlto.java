package com.design.Decorator.impostos;

import com.design.Strategy.Imposto;
import com.design.Strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto {
    public ImpostoMuitoAlto() {
    }

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
    }
}
