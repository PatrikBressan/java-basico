package edu.patrik.semana_8.projeto_banco_digital;

import java.util.List;

public class bancoDigital {
    private String nome;
    private List<conta> contas;
    

    public List<conta> getContas() {
        System.out.println(contas.iterator());
        return contas;
    }

    public void setContas(List<conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
