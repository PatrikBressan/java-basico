package edu.patrik.semana_6;

public class Autodromo {
    public static void main(String[] args) {
        Carro Jeep = new Carro();
        Jeep.setChassi("897897");
        System.out.println("O chassi do veículo é: " + Jeep.getChassi());
        Jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("467754");
        System.out.println("\nO chassi da moto é: " + z400.getChassi());
        z400.ligar();
    }
}
