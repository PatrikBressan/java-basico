package edu.patrik.projeto_Live2.models;

public class OperadorDeCaixa extends FuncionarioCLT{
    public OperadorDeCaixa(String nome, String documento, double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public OperadorDeCaixa() {
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa: " + nome + valorSalario + endereco.getRua();
    }


}
