/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.guia8;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;

/**
 *
 * @author SimonValera
 */
public class Ejercicio2Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia edward = cs.crearCircunferencia();
        cs.area(edward);
        cs.perimetro(edward);
    
        
    }
    
}
