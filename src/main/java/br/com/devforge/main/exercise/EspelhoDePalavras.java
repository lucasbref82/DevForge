package br.com.devforge.main.exercise;

public class EspelhoDePalavras {
    public static void main(String[] args) {
        String devForge = "DevForge é massa";
        String palavraEspelhada = inverterPalavras(devForge);
        System.out.println(palavraEspelhada);
    }

    private static String inverterPalavras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return frase;
        }

        String[] palavras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {
            StringBuilder invertida = new StringBuilder(palavras[i]);
            resultado.append(invertida.reverse());

            if (i < palavras.length - 1) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }
}
