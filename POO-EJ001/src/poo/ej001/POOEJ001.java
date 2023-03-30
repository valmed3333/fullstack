/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej001;

import poo.ej001.Entidad.Persona;
import poo.ej001.Servicio.ServicioPersona;

/**
 *
 * @author SimonValera
 */
public class POOEJ001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();
        p1.estudiar(5);
        
        modificador(p1);
//p1.setNombre("Simón");
        //p1.setApellido("Valera");
        //p1.setID("v8058552");
        
        System.out.println(p1.getNombre());

        p1 = null;
        System.out.println(p1);
    }

    public static void modificador(Persona p1) {
        p1.setNombre("Juan David");
        
    }

}
