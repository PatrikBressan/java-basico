package edu.patrik.projeto_Live2;

import edu.patrik.projeto_Live2.models.Endereco;
import edu.patrik.projeto_Live2.models.Gerente;
import edu.patrik.projeto_Live2.models.OperadorDeCaixa;
import edu.patrik.projeto_Live2.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Tarcísio de Almeida Jacob", "Ao lado do Beto Gás", "Bairro São Guilherme");

        System.out.println(endereco.getRua());
        System.out.println(endereco.getComplemento());
        System.out.println(endereco.getBairro());

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);

        vendedor.CalculaBonificacao(2d);

        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Camila Op Caixa", "123.456.789-00", 2000d, endereco);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Patrik Gerente");
        gerente.setDocumento("123.456.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.CalculaBonificacao(3d);

        System.out.println(gerente);


    }
}
