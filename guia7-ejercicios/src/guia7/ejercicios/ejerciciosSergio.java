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
public class ejerciciosSergio {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.println("indique que ejercicio desea probar : "+"\npara esto indique un numero del 6 al 10: ");
        int eleccion = input.nextInt();
        

        switch (eleccion){
            case 6:
                ejercicio6();
                break;//es importante usar break puesto que de lo contrario se seguiran ejecutando TODOS los casos siguientes, apartir del que se ejecute primero
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
            case 10:
                ejercicio10();
                break;
            default:
            System.out.println("eleccion no valida.");
                break;
        }
        input.close();
    }
    public static void ejercicio6(){
        System.out.println("Ingrese un numero entero: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        if (!(num%2==0)){
            System.out.println("El numero es IMPAR.");
        }else {System.out.println("El numero es PAR");}
    }
    public static void ejercicio7(){
        System.out.println("Ingrese una flase: ");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        input.close();
        frase = frase.toLowerCase();

        if (frase.equals("eureka")){//la funcion cosa.eguals(objetivo) compara lo cosa con el objetivo. 
            System.out.println("Correcto: ingresaste eureka.");
        }else{System.out.println("Incorrecto, la frase no es eureka.");}
    }
    public static void ejercicio8(){
        System.out.println("Ingrese una flase: ");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        input.close();
        frase = frase.toLowerCase();

        if (!(frase.length()<8)){
            System.out.println("Correcto: la frase tiene mas de 8 caracteres, para un total de "+frase.length()+" caracteres");
        }else{System.out.println("Incorrecto, la frase no tiene mas de 8 caracteres.");}
    }
    public static void ejercicio9(){
        System.out.println("Ingrese una flase: ");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        input.close();
        frase = frase.toUpperCase();
        String letra = frase.substring(0,0);

        if (letra == "A"){
            System.out.println("Correcto: la primera letra de la frase es "+letra);
        }else{System.out.println("Incorrecto, la primera letra de la frase no es la letra a.");}       
    }
    public static void ejercicio10(){
        System.out.println("Ingrese un numero entero limite para la suma: ");
        Scanner input = new Scanner(System.in);
        int limite = input.nextInt();
         
        int suma = 0;
        while (suma<limite){
            System.out.println("ingrese un numero para acumularlo: ");
            int num = input.nextInt();
            suma += num;
        }
        System.out.println("La suma acumulada fue de: "+suma+" y el limite era de: "+limite);
        input.close();
    }
}
