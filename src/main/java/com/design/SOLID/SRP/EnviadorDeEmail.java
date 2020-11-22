package com.design.SOLID.SRP;

public class EnviadorDeEmail implements AcaoAposGerar {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
