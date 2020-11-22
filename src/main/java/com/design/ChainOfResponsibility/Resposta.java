package com.design.ChainOfResponsibility;

public interface Resposta {
    void responde(Requisicao req, Conta conta);
}
