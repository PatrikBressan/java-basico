package edu.patrik.semana_8.projeto_banco_digital;

public class contaCorrente extends conta{

    public contaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#### Extrato Conta Corrente ####");
        super.imprimirInfosComuns();
    }
   
}
