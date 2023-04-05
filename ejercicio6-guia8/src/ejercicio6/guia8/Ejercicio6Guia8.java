/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.guia8;

import Entidades.Cafetera;
import Services.CafeteraServices;

/**
 *
 * @author SimonValera
 */
public class Ejercicio6Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServices cs = new CafeteraServices();
        Cafetera c1 = cs.crearCafetera();
        cs.menu(c1);
    }
    
}
