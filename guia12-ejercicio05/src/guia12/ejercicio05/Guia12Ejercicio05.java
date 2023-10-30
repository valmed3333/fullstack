/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.ejercicio05;

import Entidad.Jugador;
import Servicios.ServiciosJuego;

/**
 *
 * @author SimonValera
 */
public class Guia12Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosJuego sj = new ServiciosJuego();
        Jugador j1 = new Jugador();
        sj.numeroAdivinar(j1);
        System.out.println("Vamos a adivinar un número del 1 al 500");
        while(!sj.jugar(j1));
        
    }
    
}
