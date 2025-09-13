package br.com.devforge.sequential.entity;

import br.com.devforge.sequential.itf.FormaGeometrica;

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo() {

    }

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser maior que ZERO (0).");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {

    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
