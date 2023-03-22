/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minecrafttest;

/**
 *
 * @author SimonValera
 */
public class Personaje {
    private String nombre;
    private int edad;
    private String textura;
    
    public void saludar() {
            System.out.println("Hola!");
}
    public void setNombre(String nombre){
        this.nombre = nombre;
                
    }
    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
    
    
}
