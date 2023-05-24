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
        ArrayList<Jugador> l1 = new ArrayList();
        l1.add(j1);
        Equipo e1 = new Equipo();
        e1.setJugadores(l1);
        
    }
    
}
