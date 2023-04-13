/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Matematica;

/**
 *
 * @author SimonValera
 */
public class MatematicaServices {

    public double devolverMayor(Matematica m1) {
        double mayor = 0;
        if (m1.getNum1() > m1.getNum2()) {
            mayor = m1.getNum1();
            System.out.println("El primer número es mayor que el segundo");
        } else if (m1.getNum1() < m1.getNum2()) {
            mayor = m1.getNum2();
            System.out.println("El segundo número es mayor que el primero");
        } else {
            mayor = m1.getNum1();
            System.out.println("Ambos números son iguales");
        }
        return mayor;
    }

    public void calcularPotencia(Matematica m1, double mayor) {
        double menor;

        if (mayor > m1.getNum1()) {
            menor = Math.round(m1.getNum1());

        } else {
            menor = Math.round(m1.getNum2());
        }
        mayor = Math.round(mayor);
        System.out.println("El número " + mayor + " elevado a la " + menor + " es:");
        System.out.println(Math.pow(mayor, menor));
    }

    public void calculaRaiz(Matematica m1, double mayor) {
        double menor;

        if (mayor > m1.getNum1()) {
            menor = Math.round(m1.getNum1());

        } else {
            menor = Math.round(m1.getNum2());
        }

        System.out.println("La raiz cuadrada de " + menor + " es:");
        System.out.println(Math.sqrt(Math.abs(menor)));

    }

}
