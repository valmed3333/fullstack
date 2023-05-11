/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.SopaDeLetras;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class SopaDeLetrasServicios {

    Scanner leer = new Scanner(System.in);
    SopaDeLetras s1 = new SopaDeLetras();

    public void rellenarMatriz() {
        char aux = ' ';
        int cont = 0;

        System.out.println(s1.getVector()[0].length());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                aux = s1.getVector()[0].charAt(cont);
                s1.getMatriz()[i][j] = aux;
                cont++;

            }
        }

    }

    public void mostrarMatriz() {
        for (int i = 0; i < 10; i++) {
            System.out.print("[");
            for (int j = 0; j < 10; j++) {
                System.out.print(s1.getMatriz()[i][j]);
                if (j == 9) {

                } else {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }

    public void mostrarMatrizInversa() {
        for (int i = 0; i < 10; i++) {
            System.out.print("[");
            for (int j = 0; j < 10; j++) {
                System.out.print(s1.getMatriz()[j][i]);
                if (j == 9) {

                } else {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }

    public void buscarPalabra() {
        String aux = "";
        boolean palabraEncontrada = false;
        System.out.println("Ingrese palabra a remplazar dentro de la sopa de letras");
        do {
            aux = leer.nextLine().toLowerCase();
//            if (aux.length() == 5 && encontrarPalabra(aux)) {
            if (encontrarPalabra(aux)) {
                s1.setPalabra(aux);

                palabraEncontrada = true;
            } else {
                System.out.println("Palabra no encontrada. intenta de nuevo");
            }
        } while (!palabraEncontrada);
        remplazar();
        System.out.println("Ahora imprimiremos de forma invertida la sopa de letras");
        esperar(3);
        mostrarMatrizInversa();
    }

    public void remplazar() {
        boolean salir = false;
        String palabra = "";
        System.out.println("Escribe la nueva palabra para reemplazar la "
                + "palabra " + s1.getPalabra() + " de "
                + s1.getPalabra().length() + " letras.");
        do {
            palabra = leer.nextLine();
            if (palabra.length() == s1.getPalabra().length()) {
                System.out.println("Reemplazando");
                salir = true;

            } else {
                System.out.println("La palabra ingresada es de " + palabra.length()
                        + " letras, recuerde debe ser de " + s1.getPalabra().length() + " letras. Intente de nuevo");
            }
        } while (!salir);
        int encontrada = 0;
        esperar(3);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (s1.getMatriz()[i][j] == s1.getPalabra().charAt(encontrada)) {
                    encontrada++;
                    if (encontrada == s1.getPalabra().length()) {
                        for (int k = 0; k < s1.getPalabra().length(); k++) {
                            s1.getMatriz()[i][j - s1.getPalabra().length() + k + 1] = palabra.charAt(k);
                        }
                        encontrada = 0;
                    }
                } else {
                    encontrada = 0;
                }
            }
        }
        mostrarMatriz();
    }

    public boolean encontrarPalabra(String aux) {
        int encontrada = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (s1.getMatriz()[i][j] == aux.charAt(encontrada)) {
                    encontrada++;
                    System.out.println("Posicion de la letra: " + s1.getMatriz()[i][j] + " es: " + (i + 1) + "," + (j + 1));
                    if (encontrada == aux.length()) {
                        return true;
                    }
                } else {
                    encontrada = 0;
                }
            }
        }
        return false;
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
