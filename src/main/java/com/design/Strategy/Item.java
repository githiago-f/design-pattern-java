package com.design.Strategy;

public class Item {
    private final double valor;
    private final String name;
    public Item(String name, double valor) {
        this.valor = valor;
        this.name = name;
    }
    public double getValor() {
        return valor;
    }

    public String getName() {
        return name;
    }
}