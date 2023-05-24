/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10.ejercicio2;

import Entidades.*;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class Guia10Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese cuantas personas van a jugar");
        int cant = leer.nextInt();
        if (cant > 6) {
            System.out.println("Solo se consideran los primeros 6 jugadores, el resto se salvaron");
            cant = 6;
        }
        for (int i = 1; i < cant+1; i++) {
            jugadores.add(new Jugador(i, ("Jugador " + i), false));
        }
        Revolver r1 = new Revolver();
        r1.llenarRevolver();
        Juego j1 = new Juego();
        j1.llenarJuego(jugadores, r1);
        j1.ronda();
        
        for (Jugador j : j1.getJugadores()) {
            if(j.isMojado()){
                System.out.println("El " + j.getNombre() + " se mojó.");
            }else{
                System.out.println("El " + j.getNombre() + " no se mojó.");
            }
            
        }

    }
}

