package com.design.SOLID.SRP;

public class NotaFiscalDao implements AcaoAposGerar {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
