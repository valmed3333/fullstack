/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra1.guia8;

import Entidades.Fraccion;
import Servicios.FraccionServicios;

/**
 *
 * @author SimonValera
 */
public class Extraextra1Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FraccionServicios fs = new FraccionServicios();
        Fraccion f2 = new Fraccion();
        fs.crearFraccion(f2);
        fs.menu(f2);
    }
    
}
