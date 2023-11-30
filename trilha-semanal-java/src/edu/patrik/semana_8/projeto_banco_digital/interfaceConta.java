package edu.patrik.semana_8.projeto_banco_digital;

public interface interfaceConta {
    //Todo método em uma interface é público
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, conta contaDestino);

    void imprimirExtrato();
}
