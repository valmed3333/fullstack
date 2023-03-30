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
public class Libro {
    //defino atributo
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    //creo mi constructor vacio
    public Libro() {
    }
    /**
     * Creo mi constructor con los siguientes parametros
     * @param ISBN
     * @param titulo
     * @param autor
     * @param numeroPaginas 
     */
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    /**
     * 
     * @return ISBN
     */
    public String getISBN() {
        return ISBN;
    }
    /**
     * 
     * @param ISBN 
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }

    
    
}
