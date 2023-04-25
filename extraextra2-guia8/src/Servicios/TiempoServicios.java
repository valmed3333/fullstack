/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class TiempoServicios {

    private Scanner leer = new Scanner(System.in);

    public Tiempo crear() {

        Tiempo t1 = new Tiempo();
        System.out.println("Construiremos la hora actual");
        do {
            if (t1.getHoras() >= 24) {
                System.out.println("La hora ingresada no es válida, debe estar entre las 0 y las 23 horas");
            }
            System.out.println("Ingrese la hora");
            t1.setHoras(leer.nextInt());
        } while (!(t1.getHoras() <= 23));

        do {
            if (t1.getMinutos() >= 60) {
                System.out.println("Los minutos ingresados no son válidos, deben estar entre los 0 y los 59 minutos");
            }
            System.out.println("Ingrese los minutos");
            t1.setMinutos(leer.nextInt());
        } while (!(t1.getMinutos() <= 59));

        do {
            if (t1.getSegundos() >= 60) {
                System.out.println("Los segundos ingresados no son válidos, deben estar entre los 0 y los 59 segundos");
            }
            System.out.println("Ingrese los segundos");
            t1.setSegundos(leer.nextInt());
        } while (!(t1.getSegundos() <= 59));

        return t1;
    }

    public void imprimirHoraCompleta(Tiempo t1) {

        for (int i = 0; i < 10; i++) {
            
            /*String horas, minutos, segundos;

            if (t1.getHoras() < 10) {
                horas = "0" + String.valueOf(t1.getHoras());

            } else {
                horas = String.valueOf(t1.getHoras());
            }

            if (t1.getSegundos() < 10) {
                segundos = "0" + String.valueOf(t1.getSegundos());
            } else {
                segundos = String.valueOf(t1.getSegundos());
            }

            if (t1.getMinutos() < 10) {
                minutos = "0" + String.valueOf(t1.getMinutos());
            } else {
                minutos = String.valueOf(t1.getMinutos());
            }

            System.out.println(horas + ":" + minutos + ":" + segundos);*/


            if (t1.getSegundos() < 10 && t1.getMinutos() < 10 && t1.getHoras() < 10) {
                System.out.println("0" + t1.getHoras() + ":0" + t1.getMinutos() + ":0" + t1.getSegundos());
            } else if (t1.getSegundos() < 10 && t1.getMinutos() < 10) {
                System.out.println(t1.getHoras() + ":0" + t1.getMinutos() + ":0" + t1.getSegundos());
            } else if (t1.getSegundos() < 10 && t1.getHoras() < 10) {
                System.out.println("0" + t1.getHoras() + ":" + t1.getMinutos() + ":0" + t1.getSegundos());
            } else if (t1.getMinutos() < 10 && t1.getHoras() < 10) {
                System.out.println("0" + t1.getHoras() + ":0" + t1.getMinutos() + ":" + t1.getSegundos());
            } else if (t1.getSegundos() < 10) {
                System.out.println(t1.getHoras() + ":" + t1.getMinutos() + ":0" + t1.getSegundos());
            } else if (t1.getMinutos() < 10) {
                System.out.println(t1.getHoras() + ":0" + t1.getMinutos() + ":" + t1.getSegundos());
            } else if (t1.getHoras() < 10) {
                System.out.println("0" + t1.getHoras() + ":" + t1.getMinutos() + ":" + t1.getSegundos());
            } else {
                System.out.println(t1.getHoras() + ":" + t1.getMinutos() + ":" + t1.getSegundos());
            }

            esperar(1);

            t1.setSegundos(t1.getSegundos() + 1);

            if (t1.getSegundos() >= 60) {
                t1.setSegundos(0);
                t1.setMinutos(t1.getMinutos() + 1);
                if (t1.getMinutos() >= 60) {
                    t1.setMinutos(0);
                    t1.setHoras(t1.getHoras() + 1);
                    if (t1.getHoras() >= 24) {
                        t1.setHoras(0);
                    }
                }
            }
        }

    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
