package edu.patrik.semana_3;

public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "K";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }    
    }
}
