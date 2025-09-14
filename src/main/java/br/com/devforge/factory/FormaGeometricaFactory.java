package br.com.devforge.factory;

import br.com.devforge.entity.Circulo;
import br.com.devforge.entity.Retangulo;
import br.com.devforge.itf.FormaGeometrica;

import java.util.Scanner;

public class FormaGeometricaFactory {

    public static FormaGeometrica criaFormaGeometrica(int opcao, Scanner scanner) {
        switch (opcao) {
            case 1:
                System.out.print("Digite o raio: ");
                double raio = scanner.nextDouble();
                return new Circulo(raio);
            case 2:
                System.out.print("Digite a base: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura");
                double altura = scanner.nextDouble();
                return new Retangulo(base, altura);
            default:
                throw new IllegalArgumentException("Opção digitada inválida.");
        }
    }
}
