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
public class MinecraftTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje();
        
        personaje1.setNombre("simon");
        
        String nombre = personaje1.getNombre();
        
        System.out.println("Nombre: " + nombre);
        
        personaje1.saludar();
        
        Personaje hechicero1 = new hechicero();
        
        hechicero1.setNombre("HarryPotter");
        hechicero1.setEdad(32);
        hechicero1.setTextura("Harry.png");
        
        
        System.out.println("Nombre: " + hechicero1.getNombre());
        System.out.println("Edad: " + hechicero1.getEdad());
        System.out.println("Textura: " + hechicero1.getTextura());
        hechicero1.saludar();
        
        
        
        
        
        
    }
    
}
