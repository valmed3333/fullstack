/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejercicios;

/**
 *
 * @author SimonValera
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size=100;
        int[] primerosCien = new int[size];
        rellenarVectorEnteros(primerosCien, size);
        mostrarVectorInvertido(primerosCien,size);
    }
    
    
    public static void rellenarVectorEnteros(int vector[], int size){
        for(int i=0; i<size;i++){
            vector[i]=i+1;
        }
    }
    public static void mostrarVectorInvertido(int vector[], int size){
        for(int i=size-1; i>=0;i--){
            System.out.print("[" + vector[i] + "]");
        
        }
        System.out.println("");
    }
}
