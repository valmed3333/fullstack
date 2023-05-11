/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class ServiciosPerro {

    Scanner leer = new Scanner(System.in);

    List<Perro> listaRazas = new ArrayList();

    public Perro crearPerro() {
        Perro p1 = new Perro();
        System.out.println("Indique cual es la raza del perro");
        p1.setRaza(leer.next());

        return p1;
    }

    public void asignarRaza(Perro p1) {

        listaRazas.add(p1);

    }

    public void crearListaRazas() {
        boolean salir = false;
        String opcion = "";
        do {
            asignarRaza(crearPerro());
            //crearPerro();
            System.out.println("Desea agregar otra raza?");
            opcion = leer.next().toUpperCase();
            if (!(opcion.equals("SI"))) {
                salir = true;
                mostrarListaRazas();
            }

        } while (!salir);
        System.out.println("Gracias por todo");
    }

    public void mostrarListaRazas() {
        System.out.println(listaRazas.size());
        for (Perro aux : listaRazas) {
            System.out.println(aux);
        }
        for (int i = 0; i < listaRazas.size(); i++) {
            Perro aux = listaRazas.get(i);
            System.out.println(aux);
        }
    }

}
