package edu.patrik.semana_4;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("7924000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não é válido!");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        
        //simulando um cep formatado
        return "79.240-000";
    }
}
