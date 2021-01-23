package com.designPatters.TemplateMethod.Relatorios;

public class Banco {
    private final String nome;
    private final String telefone;
    private final String email;
    private final String endereco;
    public Banco(String nome, String telefone, String email, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
}
