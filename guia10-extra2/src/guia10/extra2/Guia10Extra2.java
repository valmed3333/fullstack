/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10.extra2;

import Entidades.*;

/**
 *
 * @author SimonValera
 */
public class Guia10Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine c1 = new Cine();
        c1.setPrecio(4);
        c1.setPelicula(new Pelicula("Avengers", 180, 18, "Ari"));
        Espectador e1 = new Espectador("Juan", 20, 99999999);
        c1.crearSalaLlena();
        c1.comprarEntrada(e1);
        c1.mostrarSala();
        
    }
    
}
