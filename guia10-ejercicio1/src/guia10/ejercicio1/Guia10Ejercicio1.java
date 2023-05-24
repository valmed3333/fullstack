/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10.ejercicio1;

import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author SimonValera
 */
public class Guia10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("martin", "lamas", 42, 12345678);
        Persona p2 = new Persona("natali", "paz", 34, 23456789);
        Perro m1 = new Perro("chiquito", "catumpi", "mediano", 3);
        Perro m2 = new Perro("filomeno", "boxer", "grande", 6);
        Perro m3 = new Perro("layka", "puddle", "chiquito", 5);
        //La lista 1 será la de Martin
        ArrayList<Perro> l1 = new ArrayList();
        l1.add(m1);
        //La lista 2 será la de natali
        ArrayList<Perro> l2 = new ArrayList();
        l2.add(m2);
        l2.add(m3);
        Gato g1 = new Gato("garfield", "dormido", "mediano", 11);
        p1.setGato(g1);

        p1.setPerros(l1);
        p2.setPerros(l2);

        System.out.println("El perro de " + p1.getNombre() + " se llama " + p1.getPerros().get(0).getNombre()
                + ", su raza es " + p1.getPerros().get(0).getRaza()
                + ", es de tamaño " + p1.getPerros().get(0).getTamano()
                + " y tiene " + p1.getPerros().get(0).getEdad() + " años.");

        System.out.println("El gato de " + p1.getNombre() + " se llama "
                + p1.getGato().getNombre() + ", es de raza "
                + p1.getGato().getRaza() + ", su tamaño es "
                + p1.getGato().getTamano() + " y tiene "
                + p1.getGato().getEdad() + " años.");
        System.out.println("-------------- ");
        for (Perro perro : p2.getPerros()) {
            System.out.println("El perro de " + p2.getNombre() + " se llama " + perro.getNombre()
                    + ", su raza es " + perro.getRaza()
                    + ", es de tamaño " + perro.getTamano()
                    + " y tiene " + perro.getEdad() + " años.");
        }
        System.out.println("-------------- ");
        for (int i = 0; i < p2.getPerros().size(); i++) {
            System.out.println("El perro de " + p2.getNombre() + " se llama " + p2.getPerros().get(i).getNombre()
                    + ", su raza es " + p2.getPerros().get(i).getRaza()
                    + ", es de tamaño " + p2.getPerros().get(i).getTamano()
                    + " y tiene " + p2.getPerros().get(i).getEdad() + " años.");
        }

    }

}
