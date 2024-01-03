package edu.patrik.projeto_Live2.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{
    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Nome=" + super.getNome() +
         "Documento=" + super.getDocumento() +
          "endereço=" + super.getEndereco() + 
          "horas trabalhadas=" + super.getHorasTrabalhadas() + 
          "valor hora=" + super.getValorHora() +
          " valor remuneração= " + super.getValorRemuneracao() +
          "valor bonificação=" + this.valorBonificacao;
    }

    @Override
    public void CalculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }
    
}
