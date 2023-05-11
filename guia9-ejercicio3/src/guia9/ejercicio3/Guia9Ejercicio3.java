/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio3;

import Servicios.AlumnosServicios;

/**
 *
 * @author SimonValera
 */
public class Guia9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnosServicios as = new AlumnosServicios();
        as.crearLista();
        System.out.println("La nota promedio es "+as.buscarAlumno());
        
    }
    
}
