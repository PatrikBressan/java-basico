public class MinhaClasse {
    public static void main(String [] args){
        String meuNome = "Patrik";
        System.out.println(meuNome);

        int anoFabricacao = 2023;
        boolean verdadeira = true;
        System.out.println(verdadeira);
        verdadeira = false;
        System.out.println(verdadeira);

        String nomeUm = "Patrik";
        String nomeDois = "Bressan";
        String nomeCompleto = nomeCompleto(nomeUm, nomeDois);

        System.out.println(nomeCompleto);

        /* int num1 = 5;
        int num2 = 8;
        int resultado = somar(num1, num2); */
        System.out.println(somar(5, 17));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    //Métodos com nomes no infinitivo
    public static int somar(int numeroUm, int numeroDois){
        /* int resultado = numeroUm + numeroDois;
        return resultado; */
        return numeroUm+numeroDois;
    }

    
}
