package ChainOfResponsibility;

public class RequisicaoHandler {
    public void recebeRequisicao(Requisicao requisicao, Conta conta) {
        Resposta respostaCSV = new RespostaCSV();

        Resposta respostaPorcento = new RespostaPorcento(respostaCSV);

        Resposta respostaXML = new RespostaXML(respostaPorcento);

        respostaXML.responde(requisicao, conta);
    }
}
