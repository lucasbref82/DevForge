package br.com.devforge.main.sequential;

import br.com.devforge.factory.FormaGeometricaFactory;
import br.com.devforge.itf.FormaGeometrica;

import java.util.Locale;
import java.util.Scanner;

public class CalculadorArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out.println("******** Bem vindo ao calculador de área ********\n");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 = Circulo");
        System.out.println("2 = Retangulo");
        opcao = scanner.nextInt();
        try {
            FormaGeometrica formaGeometrica = FormaGeometricaFactory.criaFormaGeometrica(opcao, scanner);
            System.out.printf("Área = %.4f", formaGeometrica.calcularArea());
        } catch (IllegalArgumentException e) {
            System.err.print(e.getMessage());
        }
        scanner.close();
    }
}
