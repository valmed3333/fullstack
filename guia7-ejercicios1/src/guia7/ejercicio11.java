/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 *
 * @author EAN
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese una frase ");
        String frase;
        frase = leer.nextLine();
        
        
        frase = frase.replace("a","@");
        frase = frase.replace("e","#");
        frase = frase.replace("i","$");
        frase = frase.replace("o","%");    
        frase = frase.replace("u","*");
    
        System.out.println(frase);
                
       // System.out.println("original: "+frase); 
        //System.out.println("subcadenainiciando3 "+frase.substring(3));
        /*
        int i;
        //reemplazar(frase);
        for(i = 0 ;i < frase.length();i++){
        String chequeo = frase.substring(i,i+1);
        
        if ("a".equals(chequeo) || "e".equals(chequeo) || "i".equals(chequeo) || "o".equals(chequeo) || "u".equals(chequeo)){
            //reemplazo(frase);
            String retorno = reemplazo(chequeo);
            frase = frase.substring(0, i)+retorno+frase.substring(i+1);
            //System.out.println(retorno);   
        }
        
        }
        System.out.println(frase);
    }
        
    public static String reemplazo(String frase){
        String reemplazo;
        switch (frase){
                case "a":
                     reemplazo = "@";
               return reemplazo; 
                case "e":
                     reemplazo = "#";
               return reemplazo;
                case "i":
                     reemplazo = "$";
               return reemplazo;
               case "o":
                     reemplazo = "%";
               return reemplazo; 
                case "u":
                     reemplazo = "*";
               return reemplazo;
               default:
                   reemplazo = "";
                  return reemplazo;
                  
                    
                 
                 
                   
                    
                    }
                
     */              
    } 
}
