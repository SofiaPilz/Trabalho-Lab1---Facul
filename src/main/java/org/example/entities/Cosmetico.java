package org.example.entities;

public class Cosmetico extends Loja {

    private Double taxaComercializacao;

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Double taxaComercializacao, Endereco endereco,
                     Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Com salario base dos funcionarios
    public Cosmetico(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario,
                     Double taxaComercializacao, Endereco endereco, Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }


    public Double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(Double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }


    @Override
    public String toString() {
        return "Cosmetica:" + getNome() + '\'' +
                ", Quantidade de Funcionarios: " + getQuantidadeFuncionarios() +
                ", Salario Base Funcionarios: " + getSalarioBaseFuncionario() +
                ", Taxa de Comercializacao: " + taxaComercializacao +
                ", Endereco: " + getEndereco() +
                ", Data de Fundacao: " + getDataFundacao();
    }
}
