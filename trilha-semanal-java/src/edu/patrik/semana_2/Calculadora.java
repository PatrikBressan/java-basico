/**
 * <h1>Calculadora</h1>
 * A calculadora realiza operações matemáticas entre números inteiros.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar
 * dos recursos oferecidos pelo autor.
 * 
 * @autor Patrik Bressan
 * @version 1.0
 * @since 22/09/2023
 */

 // comentário em uma linha
 /* bloco de comentários */
 
 /**
  * Documentação
  */

package edu.patrik.semana_2;

public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public static int somar(int numeroUm, int numeroDois){
        return numeroUm+numeroDois;
    }

    public static void main(String[] args) {
        System.out.println(somar(4,5));
    }
}
