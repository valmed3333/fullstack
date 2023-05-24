/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10.ejemplo1;

import Entidades.Dni;
import Entidades.Persona;

/**
 *
 * @author SimonValera
 */
public class Guia10Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Martin");
        p1.setApellido("Lamas");
        Dni d1 = new Dni('a',12345678);
        p1.setDni(d1);
        System.out.println(p1.getNombre() + "," + p1.getApellido() + "," 
                + p1.getDni().getSerie()+ "-" + p1.getDni().getNum());
        System.out.println(p1);
        
    }
    
}
