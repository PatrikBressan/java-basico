package edu.patrik.semana_3;

import java.util.Scanner;

public class DesafioJava_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, soma;
        
        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        B = sc.nextInt();

        soma = A + B;
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
