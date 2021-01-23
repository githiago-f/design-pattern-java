package com.designPatters.ChainOfResponsibility;

import java.util.Calendar;

public class Conta {
    private final String titular;
    private double saldo;
    private final Calendar dataDeAbertura;

    protected IAccountState accountState;

    public Conta(String titular, double saldo, Calendar dataDeAbertura) {
        this.titular = titular;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
        accountState = saldo > 0 ? new PositiveState() : new NegativeState();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        if (saldo > 0) {
            saldo += valor * 0.98;
        }
        saldo += valor * 0.95;
        changeState();
    }

    public void saca(double valor) {
        saldo -= valor;
        changeState();
    }

    private void changeState() {
        accountState.changeState(this);
    }

    public Calendar getDataDeAbertura() {
        return dataDeAbertura;
    }

    public IAccountState getAccountState() {
        return accountState;
    }
}
