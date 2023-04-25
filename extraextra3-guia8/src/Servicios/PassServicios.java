/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pass;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class PassServicios {

    Scanner leer = new Scanner(System.in);

    public void crearPass(Pass p1) {
        if (p1.getPass().equals("")) {
            do {
                System.out.println("Ingrese una contraseña de 10 dígitos");
                p1.setPass(leer.next());
                if (p1.getPass().length() != 10) {
                    System.out.println("Contraseña incorrecta, inténtelo de nuevo");
                } else {
                    System.out.println("Contraseña ingresada de forma exitosa.");
                }
            } while (p1.getPass().length() != 10);
        } else {
            System.out.println("Usted ya tiene una contraseña.\nSi "
                    + "desea gestionarla seleccione la opción modificar contraseña.");
        }

    }

    public void analizarPass(Pass p1) {
        boolean dosA = false;
        int cont = 0;
        for (int i = 0; i < p1.getPass().length(); i++) {
            if (p1.getPass().charAt(i) == 'a') {
                cont++;
            }
        }
        if (cont >= 2) {
            dosA = true;
        }

        if (p1.getPass().contains("z") && dosA) {
            System.out.println("nivel ALTO");
        } else if (p1.getPass().contains("z")) {
            System.out.println("nivel MEDIO");
        } else {
            System.out.println("nivel BAJO");
        }

    }

    public void modificarNombre(Pass p1) {
        System.out.println("Ingrese el nuevo nombre");
        p1.setNombre(leer.next());
        System.out.println("Nombre modificado de forma exitosa.");
    }

    public void modificarDni(Pass p1) {
        System.out.println("Ingrese el nuevo DNI");
        p1.setDni(leer.nextInt());
        System.out.println("DNI modificado de forma exitosa.");
    }

    public void modificarPass(Pass p1) {
        do {
            System.out.println("Ingrese la nueva contraseña de 10 dígitos");
            p1.setPass(leer.next());
            if (p1.getPass().length() != 10) {
                System.out.println("Contraseña incorrecta, inténtelo de nuevo");
            } else {
                System.out.println("Contraseña modificada de forma exitosa.");
            }
        } while (p1.getPass().length() != 10);
    }

    public boolean validarPass(Pass p1) {
        boolean accesoCorrecto = false;
        System.out.println("Ingrese la contraseña");
        String password = leer.next();

        if (p1.getPass().equals(password)) {
            accesoCorrecto = true;
            System.out.println("La contraseña ingresada es correcta.");
        } else {
            System.out.println("La contraseña ingresada es incorrecta, no podrá realizar la modificación solicitada.");
        }
        return accesoCorrecto;
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void menu(Pass p1) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido Sr./Sra. " + p1.getNombre() + ", seleccione una opción:");
            System.out.println("A. Crear contraseña.");
            System.out.println("B. Validar nivel de seguridad de la contraseña.");
            System.out.println("C. Modificar contraseña.");
            System.out.println("D. Modificar nombre.");
            System.out.println("E. Modificar DNI.");
            System.out.println("F. Mostrar datos.");
            System.out.println("G. Salir");
            String opcion = leer.next().toUpperCase();
            switch (opcion) {
                case "A":
                    crearPass(p1);
                    esperar(5);
                    break;
                case "B":
                    analizarPass(p1);
                    esperar(3);
                    break;
                case "C":
                    if (validarPass(p1)) {
                        modificarPass(p1);
                    }
                    esperar(3);
                    break;
                case "D":
                    if (validarPass(p1)) {
                        modificarNombre(p1);
                    }
                    esperar(3);
                    break;
                case "E":
                    if (validarPass(p1)) {
                        modificarDni(p1);
                    }
                    esperar(3);
                    break;
                case "F":
                    System.out.println(p1);
                    esperar(3);
                    break;
                case "G":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción valida.");
                    esperar(3);

            }
        }

    }
}
