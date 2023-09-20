package edu.patrik.semana_2;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception{
        /*
        - variável = tipos de dados + identificação + atribuição;
        - 2.500 é igual a 2.5;
        */
        double salarioMinimo = 2500;
        double salarioMinimo2 = 2.5;
        System.out.println("Salário Mínimo é: "+ salarioMinimo);
        System.out.println("Salário Mínimo 2 é: "+ salarioMinimo2);

        byte idade = 123;
        short ano = 2023;
        int cep = 79240000;
        long cpf = 123456789L;
        float pi = 3.14F;
        
        System.out.println("Idade: "+ idade);
        System.out.println("Ano: "+ ano);
        System.out.println("CEP: "+ cep);
        System.out.println("CPF: "+cpf);
        System.out.println("PI: "+pi);

        /*- JAVA é fortemente tipado */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // Problema: short numeroCurto2 = numeroNormal;
        // Solução: casting
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        //Constantes: precisa iniciar com "final"
        final double VALOR_PI = 3.14;
        System.out.println("Constante PI: "+VALOR_PI);

        //Deu erro: VALOR_PI = 3.654; Constate não se muda.

        //Por fim, strings
        String meuTexto = "Jesus, Maria e José, minha família vossa é!";
        System.out.println(meuTexto);

    }

}
