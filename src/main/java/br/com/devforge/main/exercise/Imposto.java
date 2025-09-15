package br.com.devforge.main.exercise;

public class Imposto {
    public static void main(String[] args) {
        double quantidade;
        double principal = 1000.0;
        double juros = 0.05;

        System.out.printf("%s      %20s %n", "Ano", "Quantidade de depósito.");
        for(int ano = 1; ano <= 10; ++ano) {
            quantidade = principal * Math.pow(1.0 + juros, ano);
            System.out.printf("  %4d%,20.2f%n", ano, quantidade);
        }

    }
}
