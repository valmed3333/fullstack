/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Triangulo {
    private double lado, base, altura;

    public Triangulo(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = Math.sqrt((lado*lado)-((base*base)/4));
    }

    public Triangulo() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
    
    
    
}
