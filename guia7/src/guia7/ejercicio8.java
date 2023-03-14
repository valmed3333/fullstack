package guia7;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SimonValera
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
    int respuesta =-1;
        System.out.println("Ingrese una nota entre 0 y 10");
    
    while ((respuesta < 0) || (respuesta > 10)){
    
    respuesta = leer.nextInt();
    
    if (respuesta<=10 && respuesta>= 0) {
        System.out.println("Ha ingresado una nota válida");
    }else{
        System.out.println("La nota ingresada no es válida, inténtelo de nuevo");
    }
    
}
    
    }
    
}
