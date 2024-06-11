package org.example.entities;

public class Informatica extends Loja {

    private Double seguroEletronico;

    public Informatica(String nome, Integer quantidadeFuncionarios, Double seguroEletronico, Endereco endereco,
                       Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeProdutos);
        this.seguroEletronico = seguroEletronico;
    }

    // Com salario base dos funcionarios
    public Informatica(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario,
                       Double seguroEletronico, Endereco endereco, Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.seguroEletronico = seguroEletronico;
    }


    public Double getSeguroEletronico() {
        return seguroEletronico;
    }

    public void setSeguroEletronico(Double seguroEletronico) {
        this.seguroEletronico = seguroEletronico;
    }

    @Override
    public String toString() {
        return "Cosmetica:" + getNome() + '\'' +
                ", Quantidade de Funcionarios: " + getQuantidadeFuncionarios() +
                ", Salario Base Funcionarios: " + getSalarioBaseFuncionario() +
                ", Seguro Eletronico: " + seguroEletronico +
                ", Endereco: " + getEndereco() +
                ", Data de Fundacao: " + getDataFundacao();
    }
}
