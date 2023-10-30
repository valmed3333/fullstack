/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author SimonValera
 */
public class Circulo implements calculosFormas{
    private double radio;
    private final double pi = Math.PI;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", pi=" + pi + '}';
    }

    @Override
    public void calcularArea() {
        double area = pi*radio*radio;
        System.out.println("El área del círculo es " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2*pi*radio;
        System.out.println("El perímetro del círculo es " + perimetro);
    }
    
    
}
