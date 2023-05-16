/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevicioRectangulo;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Paula Cely
 */
public class servicioRectangulo {
    private Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        
        System.out.println("Ingresa la base del rectángulo: ");
        int base = leer.nextInt();
        System.out.println("Ingresa la altura del rectángulo: ");
        int altura = leer.nextInt();
        
        return new Rectangulo(altura, base);
    }
    
    public void area(Rectangulo R1){
        int area = R1.getBase() * R1.getAltura();
        System.out.println("La superficie del rectángulo es: "+ area);
    }
    public void perimetro(Rectangulo R1){
        int perimetro = (R1.getBase() + R1.getAltura())*2;
        System.out.println("El perímetro del rectángulo es: "+ perimetro);
    }
    
    public void dibujarRectangulo(Rectangulo R1){
        for (int i = 0; i < R1.getAltura(); i++) {
            for (int j = 0; j < R1.getBase(); j++) {
                if (i==0 || i==R1.getAltura()-1 || j==0 || j==R1.getBase()-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println("");
        }
        
    }
    
}
