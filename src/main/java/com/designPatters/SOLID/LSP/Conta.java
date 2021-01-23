package com.designPatters.SOLID.LSP;

public interface Conta {
    void rende();
    void deposita(double valor);
    double getSaldo();
    void saca(double valor);
}
