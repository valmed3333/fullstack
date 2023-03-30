
package guia7.ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class ejercicio21 {

    public static void main(String[] args) {
        int[][] diezxdiez = new int[10][10];
        rellenarMatrizAleatorio(diezxdiez,10,10);
        System.out.println("Matriz M");
        mostrarMatriz(diezxdiez,10,10);
        int[][] tresxtres = new int[3][3];
        System.out.println("Ahora procedemos a rellenar la submatriz P");
        rellenarMatriz(tresxtres,3,3);
        matrizContenida(diezxdiez,tresxtres);
        
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
    public static void rellenarMatriz(int matriz[][], int filas, int columnas){
        Scanner leer = new Scanner(System.in);
                
        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                System.out.println("Ingrese el valor de la matriz en la posición ["+i+"]["+j+"]");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    public static void matrizContenida(int diez[][], int tres[][]){
        boolean encontrada=false;
        for(int i=0; i<=7;i++ ){
            for(int j=0; j<=7;j++){
                if(diez[i][j]==tres[0][0]){
                    //int[][] check = new int[3][3];
                    int contador=0;
                    for(int u=i;u<=i+2;u++){
                        for(int v=j;v<=j+2;v++){
                            if(diez[u][v]==tres[u-i][v-j]){
                                contador++;
                            }
                        }
                    }
                    if(contador==9){
                        System.out.println("La submatriz P se encuentra en las posiciones: \n" +
                                i+","+(j+0)+" "+i+","+(j+1)+" "+i+","+(j+2)+"\n"+
                                (i+1)+","+(j+0)+" "+(i+1)+","+(j+1)+" "+(i+1)+","+(j+2)+"\n"+
                                (i+2)+","+(j+0)+" "+(i+2)+","+(j+1)+" "+(i+2)+","+(j+2)+"\n"
                                );
                        encontrada=true;
                    }
                }
            }
        
        }
        if(!encontrada){
            System.out.println("La submatriz P no se encontró en la matriz M");
        }
    }
}

        