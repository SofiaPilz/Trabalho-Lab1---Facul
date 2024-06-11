package org.example.entities;

public class Vestuario extends Loja {

    private Boolean  produtosImportados;

    public Vestuario(String nome, Integer quantidadeFuncionarios, Boolean  produtosImportados, Endereco endereco,
                     Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeProdutos);
        this. produtosImportados =  produtosImportados;
    }

    // Com salario base dos funcionarios
    public Vestuario(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario,
                     Boolean  produtosImportados, Endereco endereco, Data dataFundacao, Integer quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this. produtosImportados =  produtosImportados;
    }


    public Boolean getProdutosImportados() {
        return  produtosImportados;
    }

    public void setProdutosImportados(Boolean  produtosImportados) {
        this. produtosImportados =  produtosImportados;
    }


    @Override
    public String toString() {
        return "Cosmetica:" + getNome() + '\'' +
                ", Quantidade de Funcionarios: " + getQuantidadeFuncionarios() +
                ", Salario Base Funcionarios: " + getSalarioBaseFuncionario() +
                ", Produtos Importados: " +  produtosImportados +
                ", Endereco: " + getEndereco() +
                ", Data de Fundacao: " + getDataFundacao();
    }
}
