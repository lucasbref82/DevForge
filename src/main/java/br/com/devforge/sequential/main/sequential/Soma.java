package br.com.devforge.sequential.main.sequential;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double raio;

        System.out.print("Digite o valor do raio: ");
        raio = scanner.nextDouble();

        System.out.printf("A=%.4f", calculaAreaCirculo(raio));
        scanner.close();
    }

    private static double calculaAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
