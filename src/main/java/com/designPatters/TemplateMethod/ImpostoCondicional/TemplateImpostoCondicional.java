package com.designPatters.TemplateMethod.ImpostoCondicional;

import com.designPatters.Strategy.Imposto;
import com.designPatters.Strategy.Orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {
    public TemplateImpostoCondicional() {
    }

    public TemplateImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        if(atendeCondicao(orcamento)) {
            return impostoMaximo(orcamento);
        }
        return impostoMinimo(orcamento);
    }

    public abstract double impostoMinimo(Orcamento orcamento);

    public abstract boolean atendeCondicao(Orcamento orcamento);

    public abstract double impostoMaximo(Orcamento orcamento);
}
