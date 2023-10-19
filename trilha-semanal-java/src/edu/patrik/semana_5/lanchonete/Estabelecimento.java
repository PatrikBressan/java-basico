package edu.patrik.semana_5.lanchonete;

import edu.patrik.semana_5.lanchonete.area_cliente.Cliente;
import edu.patrik.semana_5.lanchonete.atendimento.Atendente;
import edu.patrik.semana_5.lanchonete.atendimento.cozinha.Almoxarife;
import edu.patrik.semana_5.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação

		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		//atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		cliente.consultarSaldoAplicativo();
		
	}
}
