package edu.patrik.semana_6;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    //Métodos privados, víseis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a Internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem...");
    }
}
