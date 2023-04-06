/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class PersonaServices {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = input.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = input.nextInt();
        boolean error = true;
        char sexo = 'O';
        while (error) {
            System.out.println("Ingrese el sexo de la persona");
            System.out.println("H para hombre, M para mujer y O para otro");
            sexo = input.next().toUpperCase().charAt(0);
            if (sexo == 'H' || sexo == 'M' || sexo == 'O') {
                error = false;
            } else {
                System.out.println("El dato se ha introducido de forma incorrecta, inténtelo de nuevo");
            }

        }
        System.out.println("Ingrese el peso de la persona");
        double peso = input.nextDouble();
        System.out.println("Ingrese la altura de la persona");
        double altura = input.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
        //return new Persona(nombre, edad, 'O', peso, altura);
    }

    public int calcularIMC(Persona p1) {
        double IMC = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        int retorno = 0;
        if (IMC < 20) {
            retorno = -1;
            System.out.println("La persona está por debajo de su peso ideal");
            System.out.println("Tiene un IMC de " + IMC);
        } else if (IMC <= 25) {
            retorno = 0;
            System.out.println("La persona está en su peso ideal");
            System.out.println("Tiene un IMC de " + IMC);
        } else {
            retorno = 1;
            System.out.println("La persona está por encima de su peso ideal");
            System.out.println("Tiene un IMC de " + IMC);
        }
        return retorno;
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean mayorDeEdad;
        mayorDeEdad = p1.getEdad() >= 18;
        return mayorDeEdad;
    }

}
