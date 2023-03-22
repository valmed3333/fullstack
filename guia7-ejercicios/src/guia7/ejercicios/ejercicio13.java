/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejercicios;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el número de elementos del cuadrado");
        int lados = leer.nextInt();
        
        for(int i=1; i<=lados; i++){
            for(int j=1; j<=lados;j++){
                if (i==1 || i==lados || j==1 || j==lados){
                    System.out.print("* ");
                            
                }else{
                    System.out.print("  ");
                }
                    
                }
            System.out.println("");
        }
    }
    
}
