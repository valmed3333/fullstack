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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("El siguiente programa realizará una operación matemática entre 2 números");
        System.out.println("Ingrese el primer número");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=leer.nextInt();
       
        char salida='n';
        do{
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.print("Elija opción: ");
            int opcion=leer.nextInt();
        
            switch(opcion){
                case 1:
                    System.out.println("La suma de los dos números es: "+ (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos números es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La división de los dos números es: " + ((double)num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salida = leer.next().charAt(0);
                    break;

                default:
                    System.out.println("La opción ingresada es inválida, inténtelo de nuevo");

            }
        }while(salida!='s' && salida!='S');
    }
    
}
