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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int m = 5;
        String[] Equipo = new String[m];
        
        rellenarEquipo(Equipo,m);
        mostrarVector(Equipo,m);
        
    }
    
    public static void mostrarVector(String vector[],int dimension){
        Scanner leer=new Scanner(System.in);
        for (int i=0;i<dimension;i++){
            if (i<dimension-1){
                System.out.print("["+vector[i]+"]");
            }else{
                System.out.println("["+vector[i]+"]");
            }
        }
            
        
    }
    
    public static void rellenarEquipo(String vector[],int dimension){
        Scanner leer = new Scanner(System.in);
        for (int i=0;i<dimension;i++){
            System.out.println("Ingrese el nombre del siguiente compañero");
            vector[i]=leer.nextLine();
        }

    }
    
    
}
