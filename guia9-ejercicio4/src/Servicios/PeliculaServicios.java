/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class PeliculaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public Pelicula crearPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        p1.setDirector(leer.next());
        System.out.println("Ingrese la duración de la pelicula en horas");
        p1.setDuracion(leer.nextDouble());

        return p1;
    }

    public void crearLista() {
        boolean salir = false;
        String opcion = "";
        do {
            listaPeliculas.add(crearPelicula());

            System.out.println("Desea agregar otra pelicula?");
            opcion = leer.next().toUpperCase();
            if (!(opcion.equals("SI"))) {
                salir = true;
            }
        } while (!salir);

    }

    public void mostrarPeliculas() {
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }

    public void mostrarPeliculasMasUnaHora() {
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }

        }
    }

    public void ordenarDuracionMayorMenor() {
        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());

    }

    public void ordenarDuracionMenorMayor() {
        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion));

    }

    public void ordenarPorTitulo() {
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getTitulo));

    }

    public void ordenarPorDirector() {
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDirector));

    }

}
