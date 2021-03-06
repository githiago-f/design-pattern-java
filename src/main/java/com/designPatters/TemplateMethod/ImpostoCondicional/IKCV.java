package com.designPatters.TemplateMethod.ImpostoCondicional;

import com.designPatters.Strategy.Imposto;
import com.designPatters.Strategy.Item;
import com.designPatters.Strategy.Orcamento;

public class IKCV extends TemplateImpostoCondicional {
    public IKCV() {}
    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double impostoMinimo(Orcamento orcamento) {
        return  orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
    }

    @Override
    public boolean atendeCondicao(Orcamento orcamento) {
        return orcamento.getValor() > 500.00 && temItemDeValorAcimaDeCem(orcamento);
    }

    @Override
    public double impostoMaximo(Orcamento orcamento) {
        return orcamento.getValor() * 0.10 + calculaOutroImposto(orcamento);
    }

    private boolean temItemDeValorAcimaDeCem(Orcamento orcamento) {
        for (Item item : orcamento.getItems()) {
            if(item.getValor() > 100.00) return true;
        }
        return false;
    }
}
