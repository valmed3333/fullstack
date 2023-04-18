/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5.guia8;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Extra5Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String entradaTeclado = "";
        String [] meSecreto = new String [12];
        meSecreto[7] = "Julio";
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        entradaTeclado = sc.nextLine();
        while (!"Julio".equalsIgnoreCase(entradaTeclado)){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            entradaTeclado = sc.nextLine();
            if (entradaTeclado.equalsIgnoreCase("Julio")){}
            else{}
        }
        System.out.println("¡Ha acertado!");

    }
    
}
