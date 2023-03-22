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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca dos numero para comparar sin son mayores que 25");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("Ambos números ingresados son mayores que 25");
        }else if(num1>25){
            System.out.println("El primer número es mayor que 25");
        }else if(num2>25){
            System.out.println("El segundo número es mayor que 25");
        }else{
            System.out.println("Ninguno de los números ingresados es mayor que 25");
        }
    }
            
}
