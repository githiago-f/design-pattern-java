package com.designPatters.SOLID.SRP;


import java.util.List;

public class GeradorDeNotaFiscal {

    private final List<AcaoAposGerar> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerar> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for(AcaoAposGerar acao : acoes) {
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
