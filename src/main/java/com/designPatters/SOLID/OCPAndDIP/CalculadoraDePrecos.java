package com.designPatters.SOLID.OCPAndDIP;

public class CalculadoraDePrecos {
    private final TabelaDePreco tabela;
    private final ModeloDeFrete correios;

    public CalculadoraDePrecos(TabelaDePreco tabela, ModeloDeFrete correios) {
        this.tabela = tabela;
        this.correios = correios;
    }

    public double calcula(Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
