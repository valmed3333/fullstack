/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.guia8;

import Entidades.Matematica;
import Services.MatematicaServices;

/**
 *
 * @author SimonValera
 */
public class Ejercicio9Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServices ms = new MatematicaServices();
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random()*10);
        m1.setNum2(Math.random()*10);
        System.out.println(m1.getNum1());
        System.out.println(m1.getNum2());
        double mayor=ms.devolverMayor(m1);
        ms.calcularPotencia(m1, mayor);
        ms.calculaRaiz(m1, mayor);
        
        
    }
    
}
