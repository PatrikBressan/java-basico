package edu.patrik.semana_7.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
    }
    
}
