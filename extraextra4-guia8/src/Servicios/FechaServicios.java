/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Fechas;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class FechaServicios {

    Scanner leer = new Scanner(System.in);

    public void crearFecha(Fechas f1) {
        System.out.println("Ingresemos una fecha");
        System.out.println("Ingrese el día");
        f1.setDia(leer.nextInt());
        System.out.println("Ingrese el mes");
        f1.setMes(leer.nextInt());
        System.out.println("Ingrese el año");
        f1.setAnio(leer.nextInt());
        verificarAnio(f1);
    }

    public void verificarAnio(Fechas f1) {
        if (f1.getAnio() < 1900 || f1.getAnio() > 2021) {
            System.out.println("El año ingresado es inválido, se asignará el valor por defecto");
            f1.setAnio(1900);
        }
    }

    public int cantidadDias(Fechas f1) {

        int cantDias = 0, mes = f1.getMes();

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            cantDias = 30;
        } else if (mes != 2) {
            cantDias = 31;
        } else {
            cantDias = anioBisiesto(f1);
        }

        return cantDias;

    }

    public int cantidadDiasAnterior(Fechas f1, int mesAnterior) {

        int cantDias = 0, mes = mesAnterior;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            cantDias = 30;
        } else if (mes != 2) {
            cantDias = 31;
        } else {
            cantDias = anioBisiesto(f1);
        }

        return cantDias;

    }

    public int cantidadDias(Fechas f1, int mes) {

        String[] meses = {"", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO",
            "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE",
            "DICIEMBRE"};

        int cantDias = cantidadDias(f1);

        System.out.println("Usted ingreso el mes " + mes + " (" + meses[mes]
                + "), que tiene " + cantDias + " días.");

        return cantDias;

    }

    public void mostrarDiaAnterior(Fechas f1) {
        //Se crean las variables que van a almacenar el dia anterior
        int diaA, mesA, anioA;
        /*Se asigna el día anteior a la variable diaA y se procede a validar que
        el día sea distinto de 0, si es igual a cero entonces se le resta un dia
        al mes, se le da el valor del último día del mes anterior y se valida que 
        el mes no sea igual a 0.
         */
        diaA = f1.getDia() - 1;
        mesA = f1.getMes();
        anioA = f1.getAnio();
        if (diaA == 0) {
            mesA--;
            diaA = cantidadDiasAnterior(f1, mesA);
            /*
            Si el mes es igual a cero entonces este se iguala a 12, se le resta uno
            al año y se igual el día a 31.
             */
            if (mesA == 0) {
                mesA = 12;
                diaA = 31;
                anioA--;
            }
        }
        System.out.println("El día anterior es " + imprimirFecha(diaA, mesA, anioA));
    }

    public void mostrarDiaPosterior(Fechas f1) {
        //Se crean las variables que van a almacenar el dia posterior
        int diaP, mesP, anioP;
        /*Se asigna el día posterior a la variable diaP y se procede a validar que
        no sea mayor que el ultimo día del mes, si no es mayor se deja tal cual 
        si es mayor entonces se coloca como 1 y se le suma uno a la variable mesP
        
         */
        diaP = f1.getDia() + 1;
        mesP = f1.getMes();
        anioP = f1.getAnio();
        if (diaP > cantidadDias(f1)) {
            mesP++;
            diaP = 1;
            /*
            Si el mes es mayor que 12, se coloca como 1 y se le suma 1 al anioP
             */
            if (mesP > 12) {
                mesP = 1;
                anioP++;
            }
        }
        System.out.println("El día posterior es " + imprimirFecha(diaP, mesP, anioP));
    }

    public int anioBisiesto(Fechas f1) {
        int cantDias;
        if (f1.getAnio() % 4 == 0) {
            cantDias = 29;
        } else {
            cantDias = 28;
        }
        return cantDias;
    }

    public void verificarBisiesto(Fechas f1) {
        int cantDias = anioBisiesto(f1);
        if (cantDias == 29) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public String imprimirFecha(int dia, int mes, int anio) {
        String sdia, smes;
        if (dia < 10) {
            sdia = "0" + String.valueOf(dia);
        } else {
            sdia = String.valueOf(dia);
        }
        if (mes < 10) {
            smes = "0" + String.valueOf(mes);
        } else {
            smes = String.valueOf(mes);
        }
        return (sdia + "/" + smes + "/" + anio);
    }

    public void menu(Fechas f1) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Su fecha es " + imprimirFecha(f1.getDia(), f1.getMes(), f1.getAnio()));
            System.out.println("1. Verificar cantidad de días del mes.");
            System.out.println("2. Mostrar fecha anterior a la fecha ingresada.");
            System.out.println("3. Mostrar fecha posterior a la fecha ingresada.");
            System.out.println("4. Verificar si el año es bisiesto.");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cantidadDias(f1, f1.getMes());
                    break;
                case 2:
                    mostrarDiaAnterior(f1);
                    break;
                case 3:
                    mostrarDiaPosterior(f1);
                    break;
                case 4:
                    verificarBisiesto(f1);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;
            }
            esperar(2);
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
