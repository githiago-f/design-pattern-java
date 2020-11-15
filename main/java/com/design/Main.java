import SOLID.LSP.Conta;
import SOLID.LSP.ProcessadorDeInvestimentos;

import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Conta> contas = ProcessadorDeInvestimentos.contasDoBanco();

        contas.forEach(Conta::rende);
    }
}