package br.com.devforge.entity;

import br.com.devforge.itf.FormaGeometrica;

public class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo() {

    }

    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maior ou igual a ZERO (0).");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
