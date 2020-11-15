package ChainOfResponsibility;

public class RespostaXML implements Resposta {
    private final Resposta proxima;

    public RespostaXML(Resposta resposta) {
        proxima = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(!req.getFormato().equals(EFormato.XML)) {
            proxima.responde(req, conta);
            return;
        }

        System.out.printf(
            "<conta><titular>%s</titular><saldo>%s</saldo></conta>%n",
            conta.getTitular(),
            conta.getSaldo()
        );
    }
}
