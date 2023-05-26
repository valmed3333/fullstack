/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Perro {
    private String nombre, raza, tamano;
    private int edad;
    private Persona dueño;

    public Perro(String nombre, String raza, String tamano, int edad, Persona dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
        this.dueño = dueño;
    }

    
    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamano, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nPerro{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + '}';
    }
    
    
}
