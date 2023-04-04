/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.guia8;

import Entidades.Rectangulo;
import sevicioRectangulo.servicioRectangulo;

/**
 *
 * @author Paula Cely
 */
public class Ej4Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioRectangulo sr = new servicioRectangulo();
        Rectangulo R1 = sr.crearRectangulo();
        sr.area(R1);
        sr.perimetro(R1);
        sr.dibujarRectangulo(R1);
        
        
    }
    
}
