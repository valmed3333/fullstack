/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.extraextra6;

import Servicios.SopaDeLetrasServicios;

/**
 *
 * @author SimonValera
 */
public class Guia8Extraextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SopaDeLetrasServicios sls = new SopaDeLetrasServicios();
        sls.rellenarMatriz();
        sls.mostrarMatriz();
        sls.buscarPalabra();
    }

}
