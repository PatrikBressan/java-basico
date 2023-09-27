import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        /*TODO:
         * conhecer e importar a classe Scanner
         * exibir as mensagens para o nosso usuário
         * obter pelo scanner os valores digitados no terminal
         * exibir a mensagem conta criada 
         */
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta Corrente: ");
        /*Problema de leitura, "sujeira" no buffer para a leitura da próxima variável string.
         * Dessa forma, fiz esse casting para "eliminar a sujeira" do buffer, e resolvou.
        */
        numero = Integer.parseInt(sc.nextLine());

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}