/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.ejercicio04;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Guia12Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero dn = new DivisionNumero();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        String num1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        String num2 = leer.next();
        
        dn.DivisionNumero(num1, num2);

    }
//Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones
}
