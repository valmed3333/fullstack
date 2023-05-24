/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10.ejemplo2;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author SimonValera
 */
public class Guia10Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        j1.setNombre("Alejandro");
        j1.setApellido("Rodriguez");
        j1.setPosicion("Delantero");
        j1.setNumero(10);
        Jugador j2 = new Jugador("Simon", "Fraga", "Medio Campo", 12);
        Jugador j3 = new Jugador("Jose", "Peña", "Defensa", 8);
        Jugador j4 = new Jugador("Simon", "Valera", "Portero", 2);
        
        ArrayList<Jugador> l1 = new ArrayList();
        l1.add(j1);
        l1.add(j2);
        l1.add(j3);
        l1.add(j4);
        Equipo e1 = new Equipo();
        e1.setJugadores(l1);
        
        for (Jugador aux : e1.getJugadores()) {
            System.out.println("El jugador " + aux.getNombre() + " " + aux.getApellido()+
                    " tiene el número " + aux.getNumero() +" y juega la posición de " 
                    + aux.getPosicion());
        }
        System.out.println("------------------");
        for (int i = 0; i < e1.getJugadores().size(); i++) {
            System.out.println("El jugador " + e1.getJugadores().get(i).getNombre() 
                    + " " + e1.getJugadores().get(i).getApellido()+" tiene el número " 
                    + e1.getJugadores().get(i).getNumero() +" y juega la posición de " 
                    + e1.getJugadores().get(i).getPosicion());
        }
    }
    
}
