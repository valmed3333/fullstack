/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class OperacionServicio {
    private Scanner input = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese el primer número de la operación");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número de la operación");
        int num2 = input.nextInt();
        
        return new Operacion(num1,num2);
        
    }
    
    public void suma(Operacion op1){
        op1.setSuma(op1.getNumero1()+op1.getNumero2());
    }
    public void resta(Operacion op1){
        op1.setResta(op1.getNumero1()-op1.getNumero2());
    }
    public void multiplicacion(Operacion op1){
        if(op1.getNumero1()==0||op1.getNumero2()==0){
            System.out.println("Error: Multiplicacion por cero");
            op1.setMultiplicacion(0);
        }else{
            op1.setMultiplicacion(op1.getNumero1()*op1.getNumero2());
        }
    }
    public void division(Operacion op1){
        if(op1.getNumero2()==0){
            System.out.println("Error: Division por cero");
            op1.setDivision(0);
        }else{
            double division = op1.getNumero1()/op1.getNumero2();
            op1.setDivision(division);
        }
    }
}
