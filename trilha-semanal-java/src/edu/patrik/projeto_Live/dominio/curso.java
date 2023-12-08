package edu.patrik.projeto_Live.dominio;

public class curso extends conteudoEducacional{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    
}
