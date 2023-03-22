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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada;
        int correctas, incorrectas;
        correctas=0;
        incorrectas=0;
                
        do{
            System.out.println("Ingrese una cadena al dispositivo RS232");
            entrada=input.nextLine();
            int leng=entrada.length();
            if(entrada.substring(0, 1).equals("X") && entrada.substring(leng-1,leng).equals("O") && leng<=5 ){
                correctas+=1;
            }else if(entrada.equals("&&&&&")){
                
            }else{
                incorrectas+=1;
            }
            
            
        }while(!(entrada.equals("&&&&&")));
        
        System.out.println("Se tuvieron " + correctas + " lecturas correctas y " + incorrectas + " incorrectas.");
        
        
    }
    
}
