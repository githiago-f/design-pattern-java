package com.designPatters.TemplateMethod.Relatorios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {
    private final List<Cliente> clientes;
    private final Banco banco;

    public RelatorioComplexo(Banco banco, List<Cliente> clientes) {
        this.clientes = clientes;
        this.banco = banco;
    }

    @Override
    protected String cabecalho() {
        return banco.getNome() + " - " + banco.getTelefone() + " - " + banco.getEndereco();
    }

    @Override
    protected String rodape() {
        Date date =  Calendar.getInstance().getTime();
        return banco.getEmail() + "\n" + date;
    }

    @Override
    protected String corpo() {
        List<String> csv = new ArrayList<>();
        for (Cliente cliente : clientes) {
            String s =
                    cliente.getTitular() + ";" +
                    cliente.getAgencia() + ";" +
                    cliente.getNumeroDoCartao() + ";" +
                    cliente.getSaldo();
            csv.add(s);
        }
        return String.join("\n", csv);
    }
}
