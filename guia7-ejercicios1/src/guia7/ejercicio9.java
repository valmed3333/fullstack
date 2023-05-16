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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i=1, respuesta, suma=0;
              
        do{
            System.out.println("Ingrese un número mayor que cero");
            respuesta=leer.nextInt();
            if (respuesta==0) {
                System.out.println("Se capturó el numero cero");
                break;
            }else if (respuesta>0) {
                suma=suma+respuesta;
            }
            
            i=i+1;
            
        }while (i<=20);
        System.out.println("El resultado de la suma de los números introducidos es " + suma);
                
            
    }
    
}
