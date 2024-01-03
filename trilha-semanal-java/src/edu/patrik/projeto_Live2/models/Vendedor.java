package edu.patrik.projeto_Live2.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{
    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Nome=" + nome +
         "Documento=" + documento +
          "endereço=" + endereco + 
          "valor salario=" + valorSalario + 
          "valor bonificação=" + valorDaBonificacao;
    }

    @Override
    public void CalculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

}
