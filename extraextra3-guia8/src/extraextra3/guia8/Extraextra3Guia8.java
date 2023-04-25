/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra3.guia8;

import Entidades.Pass;
import Servicios.PassServicios;

/**
 *
 * @author SimonValera
 */
public class Extraextra3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PassServicios ps = new PassServicios();
        Pass p1 = new Pass("Simon",4678);
        ps.menu(p1);
        
    }
    
}
