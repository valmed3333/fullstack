/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class NIFServicios {

    Scanner leer = new Scanner(System.in);

    public NIF crearNIF() {
        String DNI = "";
        NIF n1 = new NIF();
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        System.out.println("Ingrese el DNI de 8 dígitos");
        do {
            if (DNI.length() > 8) {
                System.out.println("El DNI ingresado tiene más de 8 dígitos, inténtelo de nuevo");
            }
            n1.setDNI(leer.nextLong());
            DNI = String.valueOf(n1.getDNI());
        } while (DNI.length() > 8);
        int posicion= (int) (n1.getDNI()%23);
        n1.setLetra(letra[posicion]);
        System.out.println(n1);
        return n1;
    }
    public void mostrar(NIF n1){
        String DNI = String.format("%08d", n1.getDNI());
        DNI=DNI+"-"+n1.getLetra();
        System.out.println(DNI);
        
    }
}
