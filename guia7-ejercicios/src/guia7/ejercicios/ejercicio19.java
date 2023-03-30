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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de su matriz");       
        int m=input.nextInt();
        System.out.println("Ingrese el número de columnas de su matriz");       
        int n=input.nextInt();
        int[][] matrizA= new int[m][n];
        
        rellenarMatriz(matrizA,m,n);
        
        mostrarMatriz(matrizA,m,n);
        
        int[][] matrizB= new int[n][m];
        matrizTranspuesta(matrizA,matrizB,m,n);
        //mostrarMatrizTranspuesta(matrizA,m,n);
        comprobarMatrizAntisimetrica(matrizA,matrizB,m,n);
    }
    
    public static void comprobarMatrizAntisimetrica(int matrizA[][], int matrizB[][],int filas, int columnas){
        boolean contador=false;
        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                if(matrizA[i][j]+matrizB[i][j]!=0){
                    contador=true;
                }
            }
        }
    }
    
    public static void rellenarMatriz(int matriz[][], int filas, int columnas){
        Scanner leer = new Scanner(System.in);
                
        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                System.out.println("Ingrese el valor de la matriz en la posición ["+i+"]["+j+"]");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    
    public static void rellenarMatrizAleatorio(int matriz[][], int filas, int columnas){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número mínimo del rango de números aleatorios");
        int min = leer.nextInt();
        System.out.println("Ingrese el número máximo del rango de números aleatorios");
        int max = leer.nextInt();
        int delta = max-min;
        
        Random aleatorio = new Random();      
        
        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                matriz[i][j]=aleatorio.nextInt(delta+1)+min;
            }
        }
    }
    
    public static void mostrarMatriz(int matriz[][], int filas, int columnas){
        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
        System.out.println("");    
        }
    }
    
    public static void mostrarMatrizTranspuesta(int matriz[][], int filas, int columnas){
        System.out.println("Matriz transpuesta:");
        for(int j=0; j<columnas;j++){
            for(int i=0; i<filas;i++){
                System.out.print("["+matriz[i][j]+"]");
            }
        System.out.println("");    
        }
    }
    
    public static void matrizTranspuesta(int matrizA[][], int matrizB [][], int f, int c){
        for(int j=0; j<f;j++){
            for(int i=0; i<c;i++){
                matrizB[i][j]=matrizA[j][i];
            }
        }
        System.out.println("La matriz transpuesta es:");
        mostrarMatriz(matrizB,c,f);
    }

}