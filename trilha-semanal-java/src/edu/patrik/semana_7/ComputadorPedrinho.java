package edu.patrik.semana_7;

import edu.patrik.semana_7.apps.FacebookMessenger;
import edu.patrik.semana_7.apps.MSNMessenger;
import edu.patrik.semana_7.apps.ServicoMensagemInstantanea;
import edu.patrik.semana_7.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /* Não se sabe qual app, mas qualquer
         * um deverá enviar e receber mensagem
         */
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fcb"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
