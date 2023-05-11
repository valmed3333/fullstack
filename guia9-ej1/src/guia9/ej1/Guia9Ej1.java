/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej1;

import java.util.*;

/**
 *
 * @author SimonValera
 */
public class Guia9Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numerosA = new ArrayList();
        Integer y = 30;
        numerosA.add(y);
        for (int i = 0; i < 6; i++) {
            numerosA.add(i + 3);
        }

        numerosA.remove(y);

        System.out.println("Se imprimir el ArrayList:");
        for (int aux : numerosA) {
            System.out.print(aux + ",");
        }
        System.out.println("");
        HashSet<Integer> numerosB = new HashSet();
        for (int i = 0; i < 5; i++) {
            numerosB.add(i + 3);
        }
        numerosB.remove(3);
        System.out.println("Se imprimir el HashSet:");
        for (Integer aux : numerosB) {
            System.out.print(aux + ",");

        }

        System.out.println("");

        HashMap<Integer, String> alumnos = new HashMap();
        /*for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese dni");
            int dni = leer.nextInt();
            System.out.println("Ingrese el nombre");
            String name = leer.next();
            alumnos.put(dni, name);
        }*/
        alumnos.put(123, "martin");
        alumnos.put(124, "Paula");
        alumnos.put(125, "Maria");
        alumnos.put(126, "Simon");
        alumnos.put(127, "Juan");

        alumnos.remove(126);

        for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            System.out.println("documento = " + key + ", nombre = " + value);

        }

    }

}
