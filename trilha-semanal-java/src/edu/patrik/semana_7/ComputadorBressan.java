package edu.patrik.semana_7;

import edu.patrik.semana_7.apps.FacebookMessenger;
import edu.patrik.semana_7.apps.MSNMessenger;
import edu.patrik.semana_7.apps.Telegram;

public class ComputadorBressan {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
