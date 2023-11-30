package edu.patrik.semana_8.projeto_banco_digital;

public class Main {
    public static void main(String[] args) {
        Cliente Bressan = new Cliente();
        Bressan.setNome("Patrik");

        conta cc = new contaCorrente(Bressan);
        conta cp = new contaPoupanca(Bressan);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
