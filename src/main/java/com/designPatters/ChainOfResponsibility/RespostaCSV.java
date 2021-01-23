package com.designPatters.ChainOfResponsibility;

public class RespostaCSV implements Resposta {
    private Resposta proxima;

    public RespostaCSV() {}

    public RespostaCSV(Resposta resposta) {
        proxima = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (!req.getFormato().equals(EFormato.CSV)){
            proxima.responde(req, conta);
            return;
        }

        System.out.println(conta.getTitular() + "," + conta.getSaldo());
    }
}
