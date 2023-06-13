/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.ejercicio1;

import Entidades.*;

/**
 *
 * @author SimonValera
 */
public class Guia11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración del objeto perro
        Animal perro1 = new Perro("Joaquin","racion", "chusquito", "Perro", 5);
        perro1.alimentarse();
        
        //Declaración del objeto gato
        Gato gato1 = new Gato("Garfield", "Sardina", "Siames", "Gato", 3);
        gato1.alimentarse();
        
        //Declaración del objeto 
        Animal caballo1 = new Caballo("Spirit", "Pasto", "Kiger Mustang", "Caballo", 4);
        caballo1.alimentarse();
    }
    
}
