/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej2;

import Entidades.Libros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Guia9Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Libros> libreria = new ArrayList();
        boolean salir = false;
        int i=0;
        while (!salir) {
            Libros book = new Libros();
            System.out.println("Ingrese el nombre del titulo");
            book.setTitulo(leer.next());
            libreria.add(book);
            i++;
            if(i==3){
                salir=true;
            }
        }
        for (Libros aux : libreria) {
            System.out.println(aux);
        }
        
    }
    
}
