/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.guia8;

import Entidades.Operacion;
import Servicios.OperacionServicio;

/**
 *
 * @author SimonValera
 */
public class Ejercicio3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op1 = os.crearOperacion();
        os.suma(op1);
        os.resta(op1);
        os.multiplicacion(op1);
        os.division(op1);
        System.out.println(op1);
    }
    
}
