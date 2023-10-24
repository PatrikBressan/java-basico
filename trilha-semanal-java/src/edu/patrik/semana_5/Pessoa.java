package edu.patrik.semana_5;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Método construtor na classe Pessoa
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCPF(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }

}


