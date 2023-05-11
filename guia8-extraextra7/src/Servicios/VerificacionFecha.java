/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paula Cely
 */
public class VerificacionFecha {

    Scanner leer = new Scanner(System.in);

    public Date crearFecha() {
        /*System.out.println("Vamos a crear una fecha");
        System.out.println("Ingresa el día: ");
        int dia = leer.nextInt();
        System.out.println("Ingresa el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingresa el año: ");
        int year = leer.nextInt();
        Date fecha = new Date(year - 1900, mes - 1, dia);
        System.out.println(fecha.toString());*/

        boolean antes = true;

        long dias;
        double diferenciayear;
        int diferenciadias;
        int diferenciames;
        int actualyear = 2033;
        int dia;
        int mes;
        int year;

        System.out.println("Ingresa la fecha de vencimiento: ");

        do {
            System.out.println("Ingresa el día: ");
            dia = leer.nextInt();
        } while (dia <= 0 || dia > 31);
        boolean checkmes;
        do {

            System.out.println("Ingresa el mes: ");
            mes = leer.nextInt();

            if (dia == 31 && (mes == 2 || mes == 11 || mes == 4 || mes == 6 || mes == 9)) {
                System.out.println("El mes no es válido, intentalo de nuevo.");
                checkmes = true;
            } else if (dia == 30 && mes == 2) {
                System.out.println("El mes no es válido, intentalo de nuevo.");
                checkmes = true;
            } else {
                checkmes = false;
            }
        } while (mes < 0 || mes > 12 || checkmes == true);
        boolean checkyear;
        do {
            System.out.println("Ingresa el año: ");
            year = leer.nextInt();
            int bisiesto = year % 4;
            if (dia == 29 && mes == 2 && (bisiesto != 0)) {
                System.out.println("El año no es bisiesto, intentalo de nuevo.");
                checkyear = true;

            } else {

                checkyear = false;
            }
        } while (year <= 0 || year > actualyear || checkyear == true);

        Date fecha = new Date(year - 1900, mes - 1, dia);
        System.out.println(fecha.toGMTString());
        return fecha;
                

    }
}
