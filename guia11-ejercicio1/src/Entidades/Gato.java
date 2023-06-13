/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Gato extends Animal {

    private boolean ronronea;
    public Gato(String nombre, String alimento, String raza, String tipo, int edad) {
        super(nombre, alimento, raza, tipo, edad);
    }

    public Gato() {
    }

    public boolean isRonronea() {
        return ronronea;
    }

    public void setRonronea(boolean ronronea) {
        this.ronronea = ronronea;
    }
    
}
