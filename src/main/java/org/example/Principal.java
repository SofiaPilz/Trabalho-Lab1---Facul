package org.example;

import org.example.entities.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean var = true;
        int escolha = 0;

        Endereco enderecoShopping = new Endereco("rua", "cidade", "estado", "pais"
                , "cep", "num", "compl");
        Shopping shopping = new Shopping("Shpping", enderecoShopping, 10);

        do {

            System.out.println("----------------------");
            System.out.println("  (1) criar uma loja");
            System.out.println("  (2) criar um produto");
            System.out.println("       (3) sair");
            System.out.println("----------------------");

            try {

                escolha = in.nextInt();
                in.nextLine();


                switch (escolha) {
                    case 1:

                        System.out.println("Digite o nome da loja: ");
                        String name = in.nextLine();

                        System.out.println("Digite o numero de funcionarios: ");
                        Integer quantFunc = in.nextInt();
                        in.nextLine();

                        System.out.println("Digite o limite do seu estoque: ");
                        Integer quantProd = in.nextInt();
                        in.nextLine();

                        int opcao;
                        double salarioBase = 0.0;
                        while (true) {
                            System.out.println("Deseja informar o salário base dos funcionarios? (0=SIM) (1=NAO)");
                            opcao = in.nextInt();
                            in.nextLine();

                            if (opcao == 0) {
                                System.out.println("Informe o valor:");
                                salarioBase = in.nextDouble();
                                in.nextLine();
                                break;
                            } else if (opcao == 1) {
                                break;
                            } else {
                                System.out.println("Erro - código inválido.");
                            }
                        }

                        System.out.println("Digite os dados do endereço");
                        System.out.println("Rua: ");
                        String rua = in.nextLine();
                        System.out.println("Cidade: ");
                        String cidade = in.nextLine();
                        System.out.println("Estado: ");
                        String estado = in.nextLine();
                        System.out.println("País: ");
                        String pais = in.nextLine();
                        System.out.println("Cep: ");
                        String cep = in.nextLine();
                        System.out.println("Numero: ");
                        String numero = in.nextLine();
                        System.out.println("Complemento: ");
                        String complemento = in.nextLine();
                        Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);


                        System.out.println("Informe a data de fundação");
                        System.out.println("DIA:");
                        Integer dia = in.nextInt();
                        in.nextLine();
                        System.out.println("MES: ");
                        int mes = in.nextInt();
                        in.nextLine();
                        System.out.println("ANO: ");
                        int ano = in.nextInt();
                        in.nextLine();
                        Data dataFundacao = new Data(dia, mes, ano);

                        if (opcao == 1) { // Não quer informa salario base
                            Loja newLoja = new Loja(name, quantFunc, endereco, dataFundacao, quantProd);
                        } else {
                            Loja newLoja = new Loja(name, quantFunc, salarioBase, endereco, dataFundacao, quantProd);
                        }

                        System.out.println("Loja criada!");
                        break;

                    case 2:

                        System.out.println("Digite o nome do produto: ");
                        String nome = in.nextLine();

                        System.out.println("Digite o preço: ");
                        double preco = in.nextDouble();
                        in.nextLine();

                        System.out.println("Informe a data de validade");
                        System.out.println("DIA:");
                        Integer d = in.nextInt();
                        in.nextLine();
                        System.out.println("MES: ");
                        int m = in.nextInt();
                        in.nextLine();
                        System.out.println("ANO: ");
                        int a = in.nextInt();
                        in.nextLine();
                        Data dataValidade = new Data(d, m, a);


                        Produto newProd = new Produto(nome, preco, dataValidade);
                        Data dataAtual = new Data(20, 10, 2023);


                        if (newProd.estaVencido(dataAtual)) {                                                // true = vencido    -    flasse = não  vencido
                            System.out.println("PRODUTO VENCIDO! Data da comparação: " + dataAtual);
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO!Data da comparação: " + dataAtual);
                        }


                        break;

                    case 3:
                        System.out.println("Programa encerrado!");
                        break;

                    default:
                        System.out.println("Erro - código inválido.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro - código inválido.");
                in.nextLine();                                                                               // limpeza de buffer
            }

        } while (escolha != 3);


    } // MAIN
} // CLASSE