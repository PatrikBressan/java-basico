package edu.patrik.semana_4;

import java.util.concurrent.ThreadLocalRandom;

public class estruturasRepeticao_4 {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: R$" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio(){
        //Valores entre 2 e 8 reais (piso e teto)
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
