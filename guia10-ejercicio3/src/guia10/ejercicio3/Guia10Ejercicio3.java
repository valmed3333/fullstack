/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10.ejercicio3;

import Entidades.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author SimonValera
 */
public class Guia10Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Ari", "Alejandro", "Simon", "Juan","Tracy","Paula","Gerson","Esteban","Gad"};
        
        ArrayList<Jugador> jugadores = new ArrayList();

        Mazo m1 = new Mazo();
        m1.crearMazoNuevo();
        m1.barajar();

        for (String aux : nombres) {
            Jugador jugador = new Jugador();

            jugador.setNombre(aux);
            m1.darCartas(jugador);
            jugadores.add(jugador);

        }
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }

        /*j1.setNombre("Ari");
        m1.darCartas(j1);
        System.out.println(j1);
        j1.setNombre("Alejandro");
        m1.darCartas(j2);
        System.out.println(j2);
        j1.setNombre("Simon");
        m1.darCartas(j3);
        System.out.println(j3);
        j1.setNombre("Juan");
        m1.darCartas(j4);
        System.out.println(j4);*/
        //m1.cartasMonton();
        System.out.println("Quedan " + m1.cartasDisponibles() + " cartas.");
        m1.mostrarBaraja();

    }

}
