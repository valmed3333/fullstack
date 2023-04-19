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
public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas,numeroIntentos;
    private char[] piso;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int numeroIntentos) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.numeroIntentos = numeroIntentos;
    }

    public char[] getPiso() {
        return piso;
    }

    public void setPiso(char[] piso) {
        this.piso = piso;
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int numeroIntentos, char[] piso) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.numeroIntentos = numeroIntentos;
        this.piso = piso;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

       
}
