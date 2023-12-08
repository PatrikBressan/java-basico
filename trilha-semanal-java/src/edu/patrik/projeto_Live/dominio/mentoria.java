package edu.patrik.projeto_Live.dominio;

import java.time.LocalDateTime;

public class mentoria extends conteudoEducacional{
    private LocalDateTime data;
    
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }
}
