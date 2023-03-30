/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class LibroServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.println("Ingrese el ISBN del libro a registrar");
        String ISBN = leer.next();
        System.out.println("Ingrese el título del libro a registrar");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro a registrar");
        String autor = leer.next();
        System.out.println("Ingrese el número de páginas del libro a registrar");
        int numeroPagina = leer.nextInt();
        
        return new Libro(ISBN,titulo,autor,numeroPagina);
    }
    
    public void mostrarLibro(Libro libro1){
        System.out.println("El ISBN es: " + libro1.getISBN());
        System.out.println("El título del libro es: "+libro1.getTitulo());
        System.out.println("El autor del libro es: "+libro1.getAutor());
        System.out.println("El número de páginas del libro es: "+libro1.getNumeroPaginas());
        
    }

}
