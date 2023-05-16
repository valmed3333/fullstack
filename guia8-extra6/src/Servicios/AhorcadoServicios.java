/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class AhorcadoServicios {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra para jugar");
        String entrada = leer.next().toUpperCase();
        System.out.println("Ingrese la cantidad máxima de intentos");
        int cantidadIntentos = leer.nextInt();
        a1.setPalabra(new char[entrada.length()]);
        a1.setPiso(new char[entrada.length()]);
        for (int i = 0; i < entrada.length(); i++) {
            a1.getPalabra()[i] = entrada.charAt(i);
            a1.getPiso()[i] = '_';

        }
        a1.setNumeroIntentos(cantidadIntentos);
        a1.setLetrasEncontradas(0);

        return a1;
    }

    public void longitud(Ahorcado a1) {
        int longitud = a1.getPalabra().length;
        System.out.println("Longitud de la palabra " + longitud);
    }

    public void buscar(Ahorcado a1, char[] ingresadas) {
        int coincidencias = 0;
        char ingreso;
        boolean salir = false;
        do {
            System.out.println("Ingrese una letra:");
            ingreso = leer.next().toUpperCase().charAt(0);

            for (int i = 0; i < ingresadas.length; i++) {
                if (ingresadas[i] == '\u0000') {
                    salir = true;
                    ingresadas[i] = ingreso;
                    break;
                } else if (ingreso == ingresadas[i]) {

                    if (a1.getNumeroIntentos() > 1) {
                        System.out.println("La letra ya ha sido ingresada, inténtelo de nuevo.");
                        intentos(a1, false);
                    } else {
                        System.out.println("La letra ya ha sido ingresada");
                        a1.setNumeroIntentos(0);
                    }
                    break;
                }
            }

        } while (!salir && a1.getNumeroIntentos() > 0);

        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getNumeroIntentos() == 0) {
                break;
            }

            if (ingreso == a1.getPalabra()[i]) {
                coincidencias++;
                a1.getPiso()[i] = ingreso;
            }

        }
        longitud(a1);
        if (coincidencias > 0) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
        boolean coincide = encontradas(a1, coincidencias);
        intentos(a1, coincide);
        mostrarPiso(a1);
        System.out.println("--------------------------------------------------");

    }

    public boolean encontradas(Ahorcado a1, int coincidencias) {

        boolean encontrada;

        encontrada = coincidencias > 0;
        a1.setLetrasEncontradas(a1.getLetrasEncontradas() + coincidencias);
        int faltantes = a1.getPalabra().length - a1.getLetrasEncontradas();

        System.out.println("Número de letras (encontradas, faltantes): (" + a1.getLetrasEncontradas() + "," + faltantes + ")");
        return encontrada;
    }

    public void intentos(Ahorcado a1, boolean encontrada) {
        if (a1.getNumeroIntentos() == 0) {

        } else if (encontrada) {
        } else {
            a1.setNumeroIntentos(a1.getNumeroIntentos() - 1);
        }
        System.out.println("Número de oportunidades restantes:" + a1.getNumeroIntentos());
    }

    public void juego() {
        Ahorcado a1 = crearJuego();
        char[] ingresadas = new char[28];
        do {

            buscar(a1, ingresadas);

        } while (a1.getNumeroIntentos() > 0 && a1.getLetrasEncontradas() < a1.getPalabra().length);
        if (a1.getNumeroIntentos() == 0) {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        } else if (a1.getLetrasEncontradas() == a1.getPalabra().length) {
            System.out.println("Mensaje: Felicidades, ha descubierto la palabra");
        }

    }

    public void mostrarPiso(Ahorcado a1) {
        
        for (int i = 0; i < a1.getPiso().length; i++) {
            System.out.print(a1.getPiso()[i] + " ");
        }
        System.out.println("");
    }
}
