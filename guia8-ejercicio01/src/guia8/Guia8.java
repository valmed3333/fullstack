/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import Entidades.Libro;
import Servicios.LibroServicio;

/**
 *
 * @author SimonValera
 */
public class Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicio sl = new LibroServicio();
        Libro Natali = sl.crearLibro();
        sl.mostrarLibro(Natali);
        
        
    }
    
}
