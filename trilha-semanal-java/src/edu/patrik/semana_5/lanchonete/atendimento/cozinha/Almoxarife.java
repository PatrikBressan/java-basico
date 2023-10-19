package edu.patrik.semana_5.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	//Método default, onde somente membros do meu pacote tem acesso
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
