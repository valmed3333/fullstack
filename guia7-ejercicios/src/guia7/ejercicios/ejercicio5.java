/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author SimonValera
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        int num, doble, triple;
        double raiz;
        
        num = leer.nextInt();
        doble = num*2;
        triple = num*3;
        raiz = Math.sqrt(num);
        System.out.println(doble);
        System.out.println(triple);
        System.out.println(raiz);
                
        
        
    }
    
}
