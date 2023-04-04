/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class CuentaServicio {
    
    private Scanner input = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese el número de cuenta");
        int numCuenta = input.nextInt();
        System.out.println("Ingrese el DNI");
        long DNI = input.nextLong();
        System.out.println("Se ha creado la cuenta con un saldo 0.00");
        
        return new Cuenta(numCuenta, DNI, 0);
        
    }
    
    public void ingresar(Cuenta c1, double ingreso){
        int ing= (int)ingreso;
        c1.setSaldo(c1.getSaldo()+ing);
        System.out.println("Se depositó " + ing + " de forma exitosa\nSu nuevo saldo es de " + c1.getSaldo());
    }
    
    public void retirar(Cuenta c1, double retiro){
        int ret= (int)retiro;
        if (c1.getSaldo()-ret>0) {
            c1.setSaldo(c1.getSaldo()-ret);
            System.out.println("Se retiró " + ret + " de forma exitosa de su cuenta\nSu nuevo saldo es de " + c1.getSaldo());
        }else{
            System.out.println("Se retiró " + c1.getSaldo() + " de forma exitosa\nSu nuevo saldo es de 0.00" );
            c1.setSaldo(0);
        }
        
    }
    
    public void extraccionRapida(Cuenta c1){
        System.out.println("¿Cuanto va a retirar?");
        double retiro=input.nextDouble();
        int ret= (int) retiro;
        if (ret<=0.2*c1.getSaldo()) {
            CuentaServicio cs = new CuentaServicio();
            cs.retirar(c1, retiro);
        }else{
            System.out.println("El monto a retirar es mayor al 20% del saldo de su cuenta, por favor utilice otro método");
        }
        
    }
    
    public void consultarSaldo(Cuenta c1){
        System.out.println("El saldo de su cuenta es " + c1.getSaldo());
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println(c1);
    }
}
