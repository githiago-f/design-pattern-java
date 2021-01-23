package com.designPatters.TemplateMethod.ImpostoCondicional;

import com.designPatters.Strategy.Imposto;
import com.designPatters.Strategy.Orcamento;

public class ICPP extends TemplateImpostoCondicional {
    public ICPP() {}

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double impostoMinimo(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + calculaOutroImposto(orcamento);
    }

    @Override
    public boolean atendeCondicao(Orcamento orcamento) {
        return orcamento.getValor() > 500.00;
    }

    @Override
    public double impostoMaximo(Orcamento orcamento) {
        return orcamento.getValor() * 0.07 + calculaOutroImposto(orcamento);
    }
}
