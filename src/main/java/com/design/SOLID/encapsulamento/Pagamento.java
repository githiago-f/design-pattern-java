package com.design.SOLID.encapsulamento;

public class Pagamento {
    private final double valor;
    private final MeioDePagamento forma;

    public Pagamento(double valor, MeioDePagamento forma) {
        this.valor = valor;
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public MeioDePagamento getForma() {
        return forma;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pagamento)) {
            return false;
        }
        Pagamento outro = (Pagamento) obj;
        return forma == outro.forma
                && Double.doubleToLongBits(valor) == Double
                .doubleToLongBits(outro.valor);
    }
}