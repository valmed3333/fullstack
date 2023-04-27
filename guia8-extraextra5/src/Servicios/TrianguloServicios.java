/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class TrianguloServicios {
    private Scanner leer = new Scanner(System.in);
    
    public Triangulo solicitar(Triangulo t1){
        t1.setLado(leer.nextDouble());
        System.out.println("Ingresa la base");
        t1.setBase(leer.nextDouble());
        t1.setAltura(Math.sqrt(Math.pow(t1.getLado(), 2) - Math.pow(t1.getBase()/2.0, 2))); 
        System.out.println(t1.getAltura());
        return t1;
    }
    
    public double calcularArea(Triangulo t1){
        double area=(t1.getBase()*t1.getAltura())/2.0;
        return area;
    }
    
    public double calcularPerimetro(Triangulo t1){
        return  (t1.getLado()+t1.getLado())+t1.getBase();
    }
    
    public double mayorArea(Triangulo[] t1){
        double max=0.0;
        int posicion=0;
        for (int i=0;i<4;i++){
            if(calcularArea(t1[i])>max){
                max=calcularArea(t1[i]);
                posicion=i+1;
            }
            
            //max=Math.max(max, calcularArea(t1[i]));
        }
        System.out.println("El triangulo con mayor área es el " + posicion);
        return Math.round(max);
    }
}
