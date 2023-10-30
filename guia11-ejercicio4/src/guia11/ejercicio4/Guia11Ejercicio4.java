/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author SimonValera
 */
public class Guia11Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 3);
        Circulo c1 = new Circulo(3);
        r1.calcularArea();
        r1.calcularPerimetro();
        c1.calcularArea();
        c1.calcularPerimetro();
    }
    
}
