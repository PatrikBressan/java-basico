package edu.patrik.semana_6;

public class Carro extends Veiculo{


    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado!");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo Combustível!");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P!");
    }
}
