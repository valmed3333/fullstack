/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4.guia8;

import Entidades.NIF;
import Servicios.NIFServicios;

/**
 *
 * @author SimonValera
 */
public class Extra4Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicios ns = new NIFServicios();
        NIF n1 = ns.crearNIF();
        ns.mostrar(n1);
    }
    
}
