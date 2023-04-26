/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra4.guia8;

import Entidades.Fechas;
import Servicios.FechaServicios;

/**
 *
 * @author SimonValera
 */
public class Extraextra4Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaServicios fs= new FechaServicios();
        Fechas f1 = new Fechas();
        fs.crearFecha(f1);
        fs.menu(f1);

    }

}
