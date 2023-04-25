/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

/**
 *
 * @author npazp
 */
public class Ahorcado {

    private char[] palabra;
    private int cantidadLetras;
    private int cantidadJugadas;
    private char[] temp;//creamos atributo temporal para conocer el caracter encontrado

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantidadLetras, int cantidadJugadas, char[] temp) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugadas = cantidadJugadas;
        this.temp = temp;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    public char[] getTemp() {
        return temp;
    }

    public void setTemp(char[] temp) {
        this.temp = temp;
    }

}
