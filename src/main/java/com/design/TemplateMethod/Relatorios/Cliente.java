package com.design.TemplateMethod.Relatorios;

public class Cliente {
    private final String titular;
    private final String agencia;
    private final String numeroDoCartao;
    private final double saldo;

    public Cliente(String titular, String agencia, String numeroDoCartao, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroDoCartao = numeroDoCartao;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public double getSaldo() {
        return saldo;
    }
}
