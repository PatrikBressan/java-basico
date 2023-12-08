package edu.patrik.projeto_Live.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class bootcamp {
    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private List<conteudoEducacional> conteudos = new ArrayList<>();
    private List<dev> devs = new ArrayList<>();

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public List<conteudoEducacional> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<conteudoEducacional> conteudos) {
        this.conteudos = conteudos;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<dev> getDevs() {
        return devs;
    }
    public void setDevs(List<dev> devs) {
        this.devs = devs;
    }
}
