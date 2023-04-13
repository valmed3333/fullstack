/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14.guia8;

import Entidades.Movil;
import Services.MovilServices;

/**
 *
 * @author SimonValera
 */
public class Ejercicio14Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovilServices ms = new MovilServices();
        Movil m1 = ms.cargarCelular();
        System.out.println(m1);
        ms.mostrarCodigo(m1);
    }

}
