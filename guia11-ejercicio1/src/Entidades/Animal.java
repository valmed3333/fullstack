/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Animal {

    protected String nombre, alimento, raza, tipo;
    protected int edad;

    public Animal(String nombre, String alimento, String raza, String tipo, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void alimentarse() {
        System.out.println("El " + tipo + " que se llama " + nombre + " se alimenta de " + alimento);
    }
    /*public void alimentarse(){
        System.out.println("Yo como pollo");
    }*/

}
