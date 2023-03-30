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
public class ejercicio16 {

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
        buscarValorVector(primerosCien,n);
    }
    
    
    public static void rellenarVectorAleatorio(int vector[], int size){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número mínimo del rango de números aleatorios");
        int min = leer.nextInt();
        System.out.println("Ingrese el número máximo del rango de números aleatorios");
        int max = leer.nextInt();
        int delta = max-min;
        
        for(int i=0; i<=size-1;i++){
            Random aleatorio = new Random();      
            vector[i]=aleatorio.nextInt(delta+1)+min;
        }
    }
    public static void mostrarVector(int vector[], int size){
        for(int i=0; i<size;i++){
            System.out.print("[" + vector[i] + "]");
        
        }
        System.out.println("");
    }
    public static void buscarValorVector (int vector[], int size){
        Scanner leer = new Scanner(System.in);
        String posicion="";
        int coincidencia=0;
        System.out.println("Ingrese el valor que desea buscar en su vector");
        int objetivo=leer.nextInt();
        for(int i=0; i<size;i++){
            if(vector[i]==objetivo){
                coincidencia+=1;
                posicion=posicion.concat("["+i+"]");
                
            }
        }
        if(coincidencia==0){
            System.out.println("El valor buscado no se encontró en el vector");
        }else if(coincidencia==1){
            System.out.println("El número " + objetivo + 
                    " se encuentra en la posición " + posicion);
        }else{
            System.out.println("El valor buscado se encontró " + coincidencia +
                    " veces en las posiciones " + posicion);
        }
        
        
        
        
        
    }
    
}
