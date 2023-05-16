/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Libros {
    private String titulo;
    private int paginas;
    

    public Libros(String titulo) {
        this.titulo = titulo;
    }

    public Libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", paginas=" + paginas + '}';
    }

    
    
    
}
