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
public class Rectangulo implements calculosFormas {
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        double area = base*altura;
        System.out.println("El área del rectángulo es " + area);
        
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=2*(base+altura);
        System.out.println("El perímetro del rectángulo es " + perimetro);
    }
    
    
    
}
