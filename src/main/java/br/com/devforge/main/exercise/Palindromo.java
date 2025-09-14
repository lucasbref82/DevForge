package br.com.devforge.main.exercise;

public class Palindromo {
    public static void main(String[] args) {
        String[] testes = {"aibofobia", "jose", "ana", "pedro", "matheus", "ala", "ama"};
        for (String texto : testes) {
            System.out.printf("%s é um palindromo ? %s\n", texto, ehPalindromo(texto));
        }
    }

    private static boolean ehPalindromo(String texto) {
        if (texto.isBlank()) {
            return false;
        }
        int i = 0, j = texto.length() -1;
        while(i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
