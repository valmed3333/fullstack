package guia12.ejercicio02;

import Entidades.Persona;

/**
 *
 * @author SimonValera
 */
public class Guia12Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Martin", "Lamas", 42);
        String[] hobbies = new String[2];

        p1.setHobbies(hobbies);
        System.out.println(p1);
        //Bloque Catch
        try {

            System.out.println(p1.getHobbies()[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posición indicada está fuera de los limites de los hobbies");
        }
        //
        System.out.println("El codigo continua luego del bloque Try-Catch");
    }

}
