/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class RaicesServices {

    Scanner leer = new Scanner(System.in);

    public void constructor(Raices r1) {
        System.out.print("Ingrese el valor de 'a': ");
        r1.setA(leer.nextInt());
        System.out.print("Ingrese el valor de 'b': ");
        r1.setB(leer.nextInt());
        System.out.print("Ingrese el valor de 'c': ");
        r1.setC(leer.nextInt());

        
    }

    public double getDiscriminante(Raices r1) {
        double discriminante;
        int a, b, c;
        a = r1.getA();
        b = r1.getB();
        c = r1.getC();

        discriminante = (b * b) - (4 * a * c);

        return discriminante;
    }

    public boolean tieneRaices(Raices r1) {
        double discriminante = getDiscriminante(r1);
        return (discriminante > 0);
    }

    public boolean tieneRaiz(Raices r1) {
        double discriminante = getDiscriminante(r1);
        return (discriminante == 0);
    }

    public void obtenerRaices(Raices r1) {
        int a, b, c;
        a = r1.getA();
        b = r1.getB();
        c = r1.getC();

        if (tieneRaices(r1) == true) {
            double s1 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
            System.out.println("La raiz 1 es= " + s1);
            double s2 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
            System.out.println("La raiz 2 es= " + s2);
        }

    }

    public void obtenerRaiz(Raices r1) {
        int a, b;
        a = r1.getA();
        b = r1.getB();

        if (tieneRaiz(r1) == true) {
            double s3 = (-b / (2.0 * a));
            System.out.println("La solución es= " + s3);
        }

    }
}
