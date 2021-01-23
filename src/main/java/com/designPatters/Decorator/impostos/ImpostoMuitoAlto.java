package com.designPatters.Decorator.impostos;

import com.designPatters.Strategy.Imposto;
import com.designPatters.Strategy.Orcamento;

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
