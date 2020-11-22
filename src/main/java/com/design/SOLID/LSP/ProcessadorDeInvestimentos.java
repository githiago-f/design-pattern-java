package com.design.SOLID.LSP;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static List<Conta> contasDoBanco() {
        return Arrays
                .asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
    }

    private static Conta contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static Conta umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
}
