/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia12.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class DivisionNumero {

    public void DivisionNumero(String num1, String num2) {
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        try {
            double division = numero1 / numero2;
            System.out.println("La division de " + num1 + " entre " + num2 + " es:");
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("La división de " + num1 +" entre 0 es infito ");
            
        }
        System.out.println("Holas");
    }

}
//      Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//      números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//      para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//      una división con los dos numeros y mostrar el resultado.
