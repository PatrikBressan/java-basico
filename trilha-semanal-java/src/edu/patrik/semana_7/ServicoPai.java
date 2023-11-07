package edu.patrik.semana_7;

public class ServicoPai {
    public void enviarMensagem(){
        //primeiro confirmar se está conectado à Internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");

        //Depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    //Métodos privados, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à Internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem...");
    }
}
