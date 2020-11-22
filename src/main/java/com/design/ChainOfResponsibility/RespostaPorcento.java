package com.design.ChainOfResponsibility;

public class RespostaPorcento implements Resposta {
    private final Resposta proxima;

    public RespostaPorcento(Resposta resposta) {
        proxima = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (!req.getFormato().equals(EFormato.PORCENTO)){
            proxima.responde(req, conta);
            return;
        }
        System.out.println(conta.getTitular() + "%" + conta.getSaldo());
    }
}
