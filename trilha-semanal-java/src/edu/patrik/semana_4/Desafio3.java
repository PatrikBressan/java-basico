package edu.patrik.semana_4;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        for (int i=0; i<C; i++){
            nome = leitor.next();
            if(nome.equals("Thor"))
                System.out.println("Y");
            else
                System.out.println("N");
        }
        leitor.close();
    }
}
