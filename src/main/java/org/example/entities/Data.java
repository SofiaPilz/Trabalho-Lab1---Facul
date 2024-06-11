package org.example.entities;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;


    public Data(Integer dia, Integer mes, Integer ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        boolean var = true;
        boolean anoBissexto = verificaAnoBissexto();


        if (anoBissexto) {
            if (mes <= 12 && mes >= 1) {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia < 1 | dia > 30) {
                        System.out.println("Erro, dia inválido.");
                        var = false;
                    }
                } else if (mes == 2) {
                    if (dia < 1 | dia > 29) {
                        System.out.println("Erro, dia inválido.");
                        var = false;
                    }
                } else {
                    if (dia < 1 | dia > 31) {
                        System.out.println("Erro, dia inválido.");
                        var = false;
                    }
                }
            } else {
                System.out.println("Erro, mês inválido.");
                var = false;
            }

        } else {
            // nao bissexto
            if (mes <= 12 && mes >= 1) {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia < 1 | dia > 30) {
                        System.out.println("Erro, dia inválido.");
                        var = false;
                    }
                } else if (mes == 2) {
                    if (dia < 1 | dia > 28) {
                        System.out.println("Erro, dia inválido.");
                        var = false;
                    }
                } else {
                    if (dia < 1 | dia > 31) {
                        System.out.println("Erro, dia inválido.");
                        var = false;
                    }
                }
            } else {
                System.out.println("Erro, mês inválido.");
                var = false;

            }
        }

        if (!var) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }


    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && ano % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }


    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        // formatação exigida -> dd/mm/aa
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }


}


