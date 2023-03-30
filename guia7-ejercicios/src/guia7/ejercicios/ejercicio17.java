/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a buscar");       
        int n=input.nextInt();
        int[] primerosCien = new int[n];
        rellenarVectorAleatorio(primerosCien, n);
        mostrarVector(primerosCien,n);
        contarUnidades(primerosCien,n);
    }
    
    
    public static void rellenarVectorAleatorio(int vector[], int size){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número mínimo del rango de números aleatorios");
        int min = leer.nextInt();
        System.out.println("Ingrese el número máximo del rango de números aleatorios");
        int max = leer.nextInt();
        int delta = max-min;
        Random aleatorio = new Random();      
        
        for(int i=0; i<=size-1;i++){
            vector[i]=aleatorio.nextInt(delta+1)+min;
        }
    }
    public static void mostrarVector(int vector[], int size){
        for(int i=0; i<size;i++){
            System.out.print("[" + vector[i] + "]");
        
        }
        System.out.println("");
    }
    public static void contarUnidades (int vector[], int size){
        int und=0,decena=0,centena=0,miles=0,decenamil=0;
        double chequeo;
        for(int i=0; i<size;i++){
            int j=1;
            chequeo=vector[i];
            
            while(chequeo>10){
                chequeo=chequeo/10;
                j++;
            }
            
            if(j==1){
                und++;
            }else if(j==2){
                decena++;
            }else if(j==3){
                centena++;
            }else if(j==4){
                miles++;
            }else if(j==5){
                decenamil++;
            }   
        }
        
        System.out.println("El vector tiene almacenados:\n1. "+ und + " números de una cifra.\n2. " +
                decena + " números de dos cifras.\n3. " + centena + " números de tres cifras.\n4. " + 
                miles + " números de cuatro cifras.\n5. " + decenamil + " números de cinco cifras.");
        
        
    }
    
}
