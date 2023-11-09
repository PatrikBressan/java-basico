package edu.patrik.semana_7.equipamentos.multifuncional;

import edu.patrik.semana_7.equipamentos.copiadora.Copiadora;
import edu.patrik.semana_7.equipamentos.digitalizadora.Digitalizadora;
import edu.patrik.semana_7.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }
    
}
