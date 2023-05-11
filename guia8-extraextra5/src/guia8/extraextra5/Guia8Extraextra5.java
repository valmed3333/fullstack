/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.extraextra5;

import Entidades.Triangulo;
import Servicios.TrianguloServicios;

/**
 *
 * @author SimonValera
 */
public class Guia8Extraextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TrianguloServicios s1 = new TrianguloServicios();
        Triangulo t1 = new Triangulo();
        Triangulo[] triangulos = new Triangulo[4];
        double max = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa los lados laterales del triangulo: " + (i + 1));
            triangulos[i] = s1.solicitar(new Triangulo());
            System.out.println("El area del triangulo: " + (i + 1) + " es: " + s1.calcularArea(triangulos[i]));
            System.out.println("El perimetro del triangulo: " + (i + 1) + " es: " + s1.calcularPerimetro(triangulos[i]));
            /*if (s1.calcularArea(triangulos[i]) > max) {
                max = s1.calcularArea(triangulos[i]);
            }*/
            
        }
        System.out.println("--------------------------------------");
        //System.out.println(max);
        System.out.println("Su área es de: " + s1.mayorArea(triangulos));

    }

}
