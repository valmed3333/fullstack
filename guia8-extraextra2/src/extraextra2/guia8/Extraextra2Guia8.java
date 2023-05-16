/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra2.guia8;

import Entidades.Tiempo;
import Servicios.TiempoServicios;

/**
 *
 * @author SimonValera
 */
public class Extraextra2Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiempoServicios ts = new TiempoServicios();
        Tiempo t1=ts.crear();
        ts.imprimirHoraCompleta(t1);
    }
    
}
