package edu.patrik.semana_4;

public class estruturasRepeticao_2 {
    public static void main(String[] args) {
        //Arrays começa com índice 0 (zero)
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        /* for(int x=0; x < alunos.length; x++){
            System.out.println("O alunos no índice x = " + x + " é " + alunos[x]);
        } */

        //For each
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
