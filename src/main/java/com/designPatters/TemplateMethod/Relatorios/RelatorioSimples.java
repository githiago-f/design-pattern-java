package com.designPatters.TemplateMethod.Relatorios;

import java.util.ArrayList;
import java.util.List;

public class RelatorioSimples extends TemplateRelatorio {
    private final List<Cliente> clientes;
    private final Banco banco;

    public RelatorioSimples(Banco banco, List<Cliente> clientes) {
        this.clientes = clientes;
        this.banco = banco;
    }

    @Override
    protected String cabecalho() {
        return banco.getNome() + " - " + banco.getTelefone();
    }

    @Override
    protected String rodape() {
        return banco.getEmail();
    }

    @Override
    protected String corpo() {
        List<String> csv = new ArrayList<>();
        for (Cliente cliente : clientes) {
            String s = cliente.getTitular() + "; " + cliente.getSaldo();
            csv.add(s);
        }

        return String.join("\n", csv);
    }
}
