package org.example.entities;

import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Integer quantidadeLojasDoShopping;
    private Loja[] lojasList;


    public Shopping(String nome, Endereco endereco, Integer quantidadeLojasDoShopping) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeLojasDoShopping = quantidadeLojasDoShopping;
        this.lojasList = new Loja[quantidadeLojasDoShopping];
    }


    public boolean insereLoja(Loja loja) {
        for (int i = 0; i <= lojasList.length; i++) {
            if (lojasList[i] == null) {
                lojasList[i] = loja;
                return true;                                                                                            // produto inserido
            }
        }
        return false;                                                                                                   // produto NAO inserido
    }


    public boolean removeLoja(String nomeLoja) {

        boolean var = false;
        int indice = 0;

        for (int i = 0; i < lojasList.length; i++) {
            if (lojasList[i] != null && lojasList[i].getNome().equals(nomeLoja)) {
                lojasList[i] = null;
                var = true;
                indice = i;
                break;
            }
        }

        if (var) {
            for (int j = indice; j < lojasList.length - 1; j++) {
                lojasList[j] = lojasList[j + 1];
            }
            lojasList[lojasList.length - 1] = null;
            return true;

        } else {
            return false;
        }
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        String strForm = tipoLoja.toLowerCase();                                                                        // transformar tudo pra minusculo
        int contador = 0;
        int retorno = -1;

        if (strForm.startsWith("cosm") && strForm.endsWith("tico") || strForm.endsWith("tica") && strForm.length() == 9) {                                                   // compara as primeiras e ultimas letras das palavras
            for (Loja loja : lojasList) {
                if (loja instanceof Cosmetico) {                                                                        // traz subclasse para comparar
                    contador++;
                }
            }
        } else if (strForm.startsWith("vestu") && strForm.endsWith("rio") && strForm.length() == 9) {
            for (Loja loja : lojasList) {
                if (loja instanceof Vestuario) {
                    contador++;
                }
            }
        } else if (strForm.startsWith("biju") && strForm.endsWith("teria") && strForm.length() == 9) {
            for (Loja loja : lojasList) {
                if (loja instanceof Bijuteria) {
                    contador++;
                }
            }
        } else if (strForm.startsWith("alimenta") && strForm.endsWith("o") && strForm.length() == 11) {
            for (Loja loja : lojasList) {
                if (loja instanceof Alimentacao) {
                    contador++;
                }
            }
        } else if (strForm.startsWith("inform") && strForm.endsWith("tica") && strForm.length() == 11) {
            for (Loja loja : lojasList) {
                if (loja instanceof Informatica) {
                    contador++;
                }
            }
        }
        if (contador != 0) {
            retorno = contador;
        }
        return retorno;
    }


    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        double valorSeguroMaior = 0.0;
        for (Loja loja : lojasList) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronico() > valorSeguroMaior) {
                    valorSeguroMaior = lojaInformatica.getSeguroEletronico();
                    lojaSeguroMaisCaro = lojaInformatica;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer quantidadeLojasDoShopping() {
        return quantidadeLojasDoShopping;
    }

    public void setQuantidadeLojasDoShopping(Integer quantidadeLojasDoShopping) {
        this.quantidadeLojasDoShopping = quantidadeLojasDoShopping;
    }

    public Loja[] getLojasList() {
        return lojasList;
    }

    public void setLojasList(Loja[] lojasList) {
        this.lojasList = lojasList;
    }

    public String getLojasListNomesImpresso(Loja[] lojasList) {
        System.out.println("-------------------------");
        for (Loja loja : lojasList) {
            System.out.println(loja.getNome() + "\n");
        }
        return "-------------------------";
    }


    @Override
    public String toString() {
        return "Shopping = " +
                "Nome: " + nome + '\'' +
                ", Endereco: " + endereco +
                ", Quantidade Lojas: " + quantidadeLojasDoShopping +
                ", Lojas List:" + Arrays.toString(lojasList);
        //getLojasListNomesImpresso(lojasList)
    }
}
