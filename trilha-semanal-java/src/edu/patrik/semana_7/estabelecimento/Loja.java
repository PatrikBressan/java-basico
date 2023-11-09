package edu.patrik.semana_7.estabelecimento;

import edu.patrik.semana_7.equipamentos.copiadora.Copiadora;
import edu.patrik.semana_7.equipamentos.digitalizadora.Digitalizadora;
import edu.patrik.semana_7.equipamentos.impressora.Impressora;
import edu.patrik.semana_7.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
