/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class FraccionServicios {
    Scanner leer = new Scanner(System.in);
    
    /*public Fraccion crearFraccion(){
        Fraccion f1 = new Fraccion();
        
        System.out.println("Ingrese el numerador de la primera fracción");
        f1.setNumerador1(leer.nextInt());
        System.out.println("Ingrese el denominador de la primera fracción");
        f1.setDenominador1(leer.nextInt());
        System.out.println("Ingrese el numerador de la segunda fracción");
        f1.setNumerador2(leer.nextInt());
        System.out.println("Ingrese el denominador de la segunda fracción");
        f1.setDenominador2(leer.nextInt());
        return f1;
    }*/
    public void crearFraccion(Fraccion f1){
        System.out.println("Ingrese el numerador de la primera fracción");
        f1.setNumerador1(leer.nextInt());
        System.out.println("Ingrese el denominador de la primera fracción");
        f1.setDenominador1(leer.nextInt());
        System.out.println("Ingrese el numerador de la segunda fracción");
        f1.setNumerador2(leer.nextInt());
        System.out.println("Ingrese el denominador de la segunda fracción");
        f1.setDenominador2(leer.nextInt());
        
    }
    
    /*
    int mcm = den1 * den2;
        while (den1 != den2) {
            if (den1 < den2) {
                den1 += num1;
            } else {
                den2 += num2;
            }
        }
    
    */
    
    public void suma(Fraccion f1){
        double numerador = (f1.getDenominador1()*f1.getNumerador2()+f1.getDenominador2()*f1.getNumerador1());
        double denominador = f1.getDenominador1()*f1.getDenominador2();
        System.out.println("La suma de ambas fracciones es:");
        System.out.println(numerador/denominador);
        System.out.println(numerador + "/"+ denominador);
    }
    
    public void resta(Fraccion f1){
        double numerador = (f1.getDenominador1()*f1.getNumerador2()-f1.getDenominador2()*f1.getNumerador1());
        double denominador = f1.getDenominador1()*f1.getDenominador2();
        System.out.println("La resta de ambas fracciones es:");
        System.out.println(numerador/denominador);
        System.out.println(numerador + "/"+ denominador);
    }
    
    public void multiplicacion(Fraccion f1){
        double numerador = (f1.getNumerador2()*f1.getNumerador1());
        double denominador = f1.getDenominador1()*f1.getDenominador2();
        System.out.println("La multiplicación de ambas fracciones es:");
        System.out.println(numerador/denominador);
        System.out.println(numerador + "/"+ denominador);
    }
    
    public void division(Fraccion f1){
        double numerador = (f1.getNumerador1()*f1.getDenominador2());
        double denominador = f1.getDenominador1()*f1.getNumerador2();
        System.out.println("La división de ambas fracciones es:");
        System.out.println(numerador/denominador);
        System.out.println(numerador + "/"+ denominador);
    }
    
    public void menu(Fraccion f1){
        boolean salir = false;
        while(!salir){
            System.out.println("Selecciones una opción para operar las fracciones ingresadas");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            int opcion= leer.nextInt();
            switch(opcion){
                case 1:
                    suma(f1);
                    break;
                case 2:
                    resta(f1);
                    break;
                case 3:
                    multiplicacion(f1);
                    break;
                case 4:
                    division(f1);
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("La opción ingresada es inválida, inténtelo de nuevo.");
            }
        }
    }
    
    
    
}
