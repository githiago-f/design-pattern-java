package com.designPatters.TemplateMethod.Relatorios;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class RelatorioComplexoTest {
    private List<Cliente> clientes = new ArrayList<>();
    private Banco banco;

    @Before
    public void beforeAll() {
        banco = new Banco(
                "Banco Pelado",
                "(0xx) 0000 0000",
                "email@email.com",
                "R. Lugar nenhum, N° 65"
        );

        Cliente clienteA = new Cliente(
                "Thiago Farias",
                "0000",
                "0000 0000 0000 0000",
                200.00
        );

        Cliente clienteB = new Cliente(
                "Julia Farias",
                "0000",
                "0000 0000 0000 0001",
                200.00
        );

        clientes.add(clienteA);
        clientes.add(clienteB);
    }

    @Test
    @DisplayName("Should impress to the output")
    public void test() {
        RelatorioComplexo relatorioComplexo = new RelatorioComplexo(banco, clientes);
        String impresso = relatorioComplexo.imprimir();

        assertTrue(impresso.contains("Julia Farias"));
    }
}
