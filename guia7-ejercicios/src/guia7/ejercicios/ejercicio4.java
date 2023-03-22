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

public class ejercicio4 {

    public static void main(String[] arg){

        System.out.println("Ingrese la temperatura en grados centigrados: ");
        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        input.close();
        double f = 32 + (9*(c/5));

        System.out.println("La temperatura en fahrenheit es :"+f);
         
    }
    
}

