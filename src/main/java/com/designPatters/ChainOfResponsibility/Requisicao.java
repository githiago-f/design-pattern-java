package com.designPatters.ChainOfResponsibility;

public class Requisicao {

    private final EFormato formato;

    public Requisicao(EFormato formato) {
        this.formato = formato;
    }

    public EFormato getFormato() {
        return formato;
    }
}
