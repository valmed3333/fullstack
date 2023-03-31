/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class CircunferenciaServicio {
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el radio de la nueva circunferencia");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
        
    }
    
    public void area(Circunferencia c1){
        double area = Math.PI*c1.getRadio()*c1.getRadio();
        System.out.println("El área de la circunferencia es " + area);
    }
    
    public void perimetro(Circunferencia c1){
        double perimetro= 2*Math.PI*c1.getRadio();
        System.out.println("El perímetro de la circunferencia es " + perimetro);
    }
}
