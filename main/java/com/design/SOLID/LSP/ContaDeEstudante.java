package SOLID.LSP;

public class ContaDeEstudante implements Conta {
    private int milhas;
    private final AdmDeSaldo admDeSaldo;

    public ContaDeEstudante() {
        admDeSaldo = new AdmDeSaldo();
    }

    @Override
    public void rende() {
        admDeSaldo.rende(0);
    }

    public void deposita(double valor) {
        admDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    @Override
    public double getSaldo() {
        return admDeSaldo.saldo;
    }

    public int getMilhas() {
        return milhas;
    }
}
