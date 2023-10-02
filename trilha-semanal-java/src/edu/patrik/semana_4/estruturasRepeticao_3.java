package edu.patrik.semana_4;

public class estruturasRepeticao_3 {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            System.out.println("Exemplo de For Break");
            if(numero == 3)
                break;
            
            System.out.println(numero);
        }

        for(int numero = 1; numero <= 5; numero++){
            System.out.println("Exemplo de For Continue");
            if(numero == 3)
                continue;
            
            System.out.println(numero);
        }
    }
}
