/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.guia8;

import Entidades.Cadena;
import Services.CadenaServices;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Ejercicio8Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        CadenaServices cs = new CadenaServices();
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una palabra o una frase");
        c1.setFrase(input.next());
        c1.setLongitud(c1.getFrase().length());
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        System.out.print("Ingrese un carácter a buscar: ");
        String letra=input.next();
        cs.vecesRepetido(c1, letra);
        cs.compararLongitud(c1);
        cs.unirFrases(c1);
        cs.reemplazar(c1);
        cs.contiene(c1);
    }
    
}
