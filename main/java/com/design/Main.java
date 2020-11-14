import SOLID.LSP.Conta;
import SOLID.LSP.ProcessadorDeInvestimentos;

class Main {
    public static void main(String[] args) {
        var contas = ProcessadorDeInvestimentos.contasDoBanco();
        for (Conta conta : contas) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
}