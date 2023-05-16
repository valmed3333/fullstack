/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej001.Servicio;

import java.util.Scanner;
import poo.ej001.Entidad.Persona;

/**
 *
 * @author SimonValera
 */
public class ServicioPersona {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido de la persona");
        String apellido = leer.next();
        System.out.println("Ingrese el ID de la persona");
        String id = leer.next();
      
        
        
        return new Persona(nombre, apellido, id);
    }
    
}
