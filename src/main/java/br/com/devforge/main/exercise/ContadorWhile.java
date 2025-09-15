package br.com.devforge.main.exercise;

public class ContadorWhile {
    public static void main(String[] args) {
        int count = 0;
        while (++count <= 10) {
            System.out.printf("Número: %d\n", count);
        }
    }
}
