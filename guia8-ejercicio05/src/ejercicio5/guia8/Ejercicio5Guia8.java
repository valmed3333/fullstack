/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.guia8;

import Entidades.Cuenta;
import Servicios.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Ejercicio5Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        System.out.println("Crear Cuenta:");
        Cuenta c1 = cs.crearCuenta();
        boolean check = true;
        while (check) {
            System.out.println("Menu:\n1." + " Consultar Datos:\n2." + " Consultar Saldo:\n3." + " Depositar:\n4."
                    + " Retirar:\n5." + " Retiro Rápido:\n6." + " Salir:");

            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    cs.consultarDatos(c1);
                    break;
                case 2:
                    cs.consultarSaldo(c1);
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea depositar en la cuenta");
                    double ingreso = input.nextDouble();
                    cs.ingresar(c1, ingreso);
                    break;
                case 4:
                    System.out.println("Ingrese el monto que desea retirar de la cuenta");
                    double retiro = input.nextDouble();
                    cs.retirar(c1, retiro);
                    break;
                case 5:
                    cs.extraccionRapida(c1);
                    break;
                case 6:
                    check=false;
                    break;

                default:
                    System.out.println("La opción ingresada no es válida");
                    break;

            }

        }
    }

}
