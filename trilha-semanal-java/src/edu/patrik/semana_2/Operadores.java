package edu.patrik.semana_2;

public class Operadores {
    /* atribuição: =
     * igualdade: ==
     * char recebe um único caracter com aspas simples ''
     * String com S maiúsculo e aspas duplas ""
     */
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Resultado: " + resultado);

        //Concatenação
        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);
        //concat = 1+1+1+"1"; Não deu certo igual no material
        //System.out.println(concat);

        //incremento ou repetição
        int numero = 5;
        numero++;
        System.out.println(++numero);

        //boolean: sinal de exclamação (!) nega o valor
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //Operador ternário ?:
        // <expressão condicional> ? <caso condição seja true> : <caso condição seja false>
        int a=5,b=6;
        String resultado2="";
        if(a==b)
            resultado2 = "Verdadeiro";
        else
            resultado2 = "Falso";
        
        System.out.println(resultado2);
        
        //Forma otimizada
        a=6;b=6;
        resultado2 = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado2);

        int resultado3;
        resultado3 = a==b ? 1 : 0;
        System.out.println(resultado3);

        /*Relacionais:
         * ==
         * !=
         * >
         * >=
         * <
         * <=
         */
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a Numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente a Numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior a Numero2? " + simNao);

        simNao = numero1 < numero ? true : false;
        System.out.println("Numero1 é menor que Numero2? " + simNao);

        /*Operadores Lógicos
         * && = and
         * || = or
         */
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 && (7>4));
    }
    
}
