package org.example.entities;

public class Loja {


    private String nome;
    private Integer quantidadeFuncionarios;
    private Double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Integer quantidadeProdutos;
    private Produto[] estoqueProdutos;


    public Loja(String nome, Integer quantidadeFuncionarios, Endereco endereco,
                Data dataFundacao, Integer quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeProdutos = quantidadeProdutos;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Loja(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco,
                Data dataFundacao, Integer quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeProdutos = quantidadeProdutos;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }


    public Double gastosComSalario() {

        if (salarioBaseFuncionario == -1) {
            return salarioBaseFuncionario;
        } else {
            double valor = (quantidadeFuncionarios * salarioBaseFuncionario);
            return valor;
        }
    }

    public String tamanhoDaLoja() {
        String p = "P";
        String m = "M";
        String g = "G";

        if (quantidadeFuncionarios < 10) {
            return p;
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return m;
        } else {
            return g;
        }
    }

    public void imprimeProdutos() {
        int i = 0;
        for (Produto prod : estoqueProdutos) {
            System.out.println(i + ") " + "Nome: " + prod.getNome() + " |  Preço: " + prod.getPreco() +
                    " |  Data de Validade: " + prod.getDataValidade() + '\n');
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;                                                                                            // produto inserido
            }
        }
        return false;                                                                                                   // produto NAO inserido
    }

    public boolean removeProduto(String nomeProd) {
        int i = 0;
        for (Produto produto : estoqueProdutos) {
            i++;
            if (produto.getNome().equals(nomeProd)) {
                int j = i - 1;

                estoqueProdutos[j] = null;
                return true;
            }
        }
        return false;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(Double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Integer getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(Integer quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja: " + nome + '\'' +
                ", Quantidade de Funcionarios: " + quantidadeFuncionarios +
                ", Salario Base Funcionarios: " + salarioBaseFuncionario +
                ", Endereco: " + endereco +
                ", Data de Fundacao: " + dataFundacao +
                ", Capacidade do Estoque: " + quantidadeProdutos;
    }
}

