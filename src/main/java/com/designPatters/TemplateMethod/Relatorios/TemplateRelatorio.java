package com.designPatters.TemplateMethod.Relatorios;

public abstract class TemplateRelatorio implements Relatorio {
    @Override
    public final String imprimir() {
        return cabecalho() + "\n" + corpo() + "\n" + rodape();
    }

    protected abstract String cabecalho();
    protected abstract String rodape();
    protected abstract String corpo();
}
