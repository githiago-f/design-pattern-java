package ChainOfResponsibility;

public interface Resposta {
    void responde(Requisicao req, Conta conta);
}
