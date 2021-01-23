package com.designPatters.SOLID.LSP;

public class ContaComum implements Conta {
    private final AdmDeSaldo admDeSaldo;
    public ContaComum() {
        admDeSaldo = new AdmDeSaldo();
    }

    public void rende() {
        admDeSaldo.rende(1.1);
    }

    public void deposita(double valor) {
        admDeSaldo.deposita(valor);
    }

    public double getSaldo() {
        return admDeSaldo.saldo;
    }

    public void saca(double valor) {
        admDeSaldo.saca(valor);
    }
}
