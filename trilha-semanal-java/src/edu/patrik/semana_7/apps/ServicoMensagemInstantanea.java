package edu.patrik.semana_7.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //Mais um método que todos os filhos deverão implementar
    public abstract void salvarHistoricoMensagem();

    //Somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a Internet");
    }
}
