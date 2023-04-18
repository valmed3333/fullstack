/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3.guia8;

import Entidades.Raices;
import Services.RaicesServices;

/**
 *
 * @author SimonValera
 */
public class Extra3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServices rs = new RaicesServices();
        Raices r1= new Raices();
        rs.constructor(r1);
        rs.obtenerRaices(r1);
        rs.obtenerRaiz(r1);
        if(rs.tieneRaices(r1)==false && rs.tieneRaiz(r1)==false){
            System.out.println("No existe ninguna solución para la ecuación dada");
        }
    }
    
    
    
    
    
}
