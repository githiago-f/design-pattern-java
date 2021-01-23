package com.designPatters.Strategy;

public class CalculadoraDeImpostos {
    public void calculaImposto(Orcamento orcamento, Imposto imposto) {
        System.out.printf("Imposto: %s%n", imposto.calcula(orcamento));
    }
}
