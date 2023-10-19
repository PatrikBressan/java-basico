package edu.patrik.semana_5.lanchonete.escola;

//O método Getter, retorna o valor do atributo especificado
//O método Setter, define outro novo valor para o atributo especificado
//Métodos get e set precisam ser public

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setSexo("Masculino");

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos, e é do sexo " + felipe.getSexo());
    }
}
