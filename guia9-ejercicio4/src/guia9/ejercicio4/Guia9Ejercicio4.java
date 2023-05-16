/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio4;

import Servicios.PeliculaServicios;

/**
 *
 * @author SimonValera
 */
public class Guia9Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicios ps = new PeliculaServicios();
        ps.crearLista();
        System.out.println("\nLas peliculas son:");
        ps.mostrarPeliculas();
        System.out.println("\nLas peliculas de mas de una hora son:");
        ps.mostrarPeliculasMasUnaHora();
        System.out.println("\nSe ordenan por duracion de mayor a menor");
        ps.ordenarDuracionMayorMenor();
        ps.mostrarPeliculas();
        System.out.println("\nSe ordenan por duracion de menor a mayor");
        ps.ordenarDuracionMenorMayor();
        ps.mostrarPeliculas();
        System.out.println("\nSe ordenan por título");
        ps.ordenarPorTitulo();
        ps.mostrarPeliculas();
        System.out.println("\nSe ordenan por director");
        ps.ordenarPorDirector();
        ps.mostrarPeliculas();

    }

}
