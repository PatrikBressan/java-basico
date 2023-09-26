package edu.patrik.semana_3;

import java.util.Scanner;

public class DesafioJava_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = sc.nextInt();

        PROD = A*B;

        System.out.println("PROD = " + PROD);
        sc.close();
    }
}