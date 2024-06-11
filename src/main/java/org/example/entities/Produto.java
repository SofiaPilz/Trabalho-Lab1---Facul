package org.example.entities;

public class Produto {


    private String nome;
    private Double preco;
    private Data dataValidade;


    public Produto(String nome, Double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data) {
        boolean var = false;

        if (data.getAno() > dataValidade.getAno()) {
            var = true;

        } else if (data.getAno().equals(dataValidade.getAno())) {

            if (data.getMes() > dataValidade.getMes()) {
                var = true;
            } else if (data.getMes().equals(dataValidade.getMes())) {
                if (data.getDia() > dataValidade.getDia()) {
                    var = true;
                }
            }
        }
        return var;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " +  nome + '\'' +
                ", Preco:" + preco +
                ", Data de Validade: " + dataValidade;
    }
}
