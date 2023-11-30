package edu.patrik.semana_8.projeto_banco_digital;

public class contaPoupanca extends conta{

    public contaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#### Extrato Conta Poupança ####");
        super.imprimirInfosComuns();
    }
    
}
