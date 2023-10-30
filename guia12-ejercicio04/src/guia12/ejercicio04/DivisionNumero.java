/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia12.ejercicio04;

import java.util.*;

/**
 *
 * @author SimonValera
 */
public class DivisionNumero {

    public void DivisionNumero(String num1, String num2) {
        Scanner leer = new Scanner(System.in);
        try {
            
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            double division = numero1 / numero2;
            System.out.println("La division de " + num1 + " entre " + num2 + " es:");
            System.out.println(division);
            System.out.println("Ingrese el tercer numero");
            int num3 = leer.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("La división de " + num1 + " entre 0 es infinito ");

        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar dos números, no se aceptan caracteres");
        } catch (InputMismatchException e) {
            System.out.println("El dato introducido no es del tipo esperado");
        }
        System.out.println("Holas");
    }
}
