package edu.patrik.semana_7.projeto_iphone;

public class Ipod implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar() {
        System.out.println("Pausado!");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
    
}
