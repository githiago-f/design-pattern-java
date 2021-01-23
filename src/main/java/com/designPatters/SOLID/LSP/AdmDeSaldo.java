package com.designPatters.SOLID.LSP;

public class AdmDeSaldo {
    public double saldo;

    public void rende(double taxa) {
        this.saldo += this.saldo * taxa;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
