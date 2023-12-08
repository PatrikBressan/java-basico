package edu.patrik.projeto_Live.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dev {
    private String nome;
    private List<conteudoEducacional> conteudosInscritos = new ArrayList<>();
    private List<conteudoEducacional> conteudosConcluidos = new ArrayList<>();

    public void progredir(){
        Optional<conteudoEducacional> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em mais nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
        .mapToDouble(conteudoEducacional -> conteudoEducacional.calcularXp())
        .sum();
    }

    public void inscrever(conteudoEducacional conteudo){
        if (conteudosInscritos.contains(conteudo)) {
            System.err.println("Você já se inscreveu nesse conteúdo.");
        } else {
            conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(bootcamp bootcamp){
        // Alternativa 1: foreach tradicional
        // for (conteudoEducacional conteudo : bootcamp.getConteudos()) {
        //     inscrever(conteudo);
        // }

        // Alternativa 2: API de Stream
        bootcamp.getConteudos().stream().forEach(this::inscrever);
        bootcamp.getDevs().add(this);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<conteudoEducacional> getConteudosInscritos() {
        return conteudosInscritos;
    }
    public void setConteudosInscritos(List<conteudoEducacional> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }
    public List<conteudoEducacional> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(List<conteudoEducacional> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
