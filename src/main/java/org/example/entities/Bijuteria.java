package org.example.entities;

public class Bijuteria extends Loja {

    private Double metaVendas;

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Double metaVendas, Endereco endereco,
                     Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }

    // Com salario base dos funcionarios
    public Bijuteria(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario,
                     Double metaVendas, Endereco endereco, Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }


    public Double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(Double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Cosmetica:" + getNome() + '\'' +
                ", Quantidade de Funcionarios: " + getQuantidadeFuncionarios() +
                ", Salario Base Funcionarios: " + getSalarioBaseFuncionario() +
                ", Meta de Vendas: " + metaVendas +
                ", Endereco: " + getEndereco() +
                ", Data de Fundacao: " + getDataFundacao();
    }
}
