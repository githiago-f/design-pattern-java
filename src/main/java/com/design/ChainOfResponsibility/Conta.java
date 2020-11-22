package com.design.ChainOfResponsibility;

import java.util.Calendar;
import java.util.Date;

public class Conta {
    private final String titular;
    private final double saldo;
    private final Calendar dataDeAbertura;

    public Conta(String titular, double saldo, Calendar dataDeAbertura) {
        this.titular = titular;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Calendar getDataDeAbertura() {
        return dataDeAbertura;
    }
}
