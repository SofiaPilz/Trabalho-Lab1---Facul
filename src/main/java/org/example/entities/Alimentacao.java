package org.example.entities;

public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Data dataAlvara, Endereco endereco,
                       Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Com salario base dos funcionarios
    public Alimentacao(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario,
                       Data dataAlvara, Endereco endereco, Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }


    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Cosmetica:" + getNome() + '\'' +
                ", Quantidade de Funcionarios: " + getQuantidadeFuncionarios() +
                ", Salario Base Funcionarios: " + getSalarioBaseFuncionario() +
                ", Data Alvara: " + dataAlvara +
                ", Endereco: " + getEndereco() +
                ", Data de Fundacao: " + getDataFundacao();
    }
}
