/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,j, num, num2, num3, num4;
        String cadena;
        
        System.out.println("Ingrese un número del 1 al 20");        
        
        for (i=1; i<5; i++){
            num=0;
            while ((num < 1) || (num > 20)){

                num = leer.nextInt();
                if (num<=20 && num>= 1) {
                    cadena = num + " ";
                    for (j=1; j<=num;j++){
                        cadena = cadena + "*";
                    }
                    System.out.println(cadena);

                }else{
                    System.out.println("El número ingresado no es válido, inténtelo de nuevo");
                }
            }
        }   
        
    }
    
}
