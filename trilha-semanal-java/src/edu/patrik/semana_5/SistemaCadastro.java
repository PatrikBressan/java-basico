package edu.patrik.semana_5;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "Marcos");

        //definimos o endereço de Marcos
        marcos.setEndereco("Rua das Marias");

        //e como definir o nome e cpf do Marcos?

        //imprimindo o Marcos sem o nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCPF());
    }
}
