/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author SimonValera
 */
public class Pelicula {
    private String director, titulo;
    private double duracion;

    public Pelicula(String director, String titulo, double duracion) {
        this.director = director;
        this.titulo = titulo;
        this.duracion = duracion;
    }

        public Pelicula() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "director=" + director + ", titulo=" + titulo + ", duracion=" + duracion + '}';
    }
    
    /*public static Comparator<Pelicula> compararDuracionMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare (Pelicula p1, Pelicula p2){
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    }*/
}
