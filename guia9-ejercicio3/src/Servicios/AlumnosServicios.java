/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumnos;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class AlumnosServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumnos> listaAlumnos = new ArrayList();

    public Alumnos crearAlumno() {
        Alumnos a1 = new Alumnos();
        System.out.println("Ingrese el nombre del alumno");
        a1.setNombre(leer.next());
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota #" + (i + 1));
            Integer nota = leer.nextInt();
            notas.add(nota);
            //a1.getNotas().add(nota);
        }
        a1.setNotas(notas);

        return a1;
    }

    public void crearLista() {
        boolean salir = false;
        String opcion = "";
        do {
            listaAlumnos.add(crearAlumno());

            System.out.println("Desea agregar otro alumno?");
            opcion = leer.next().toUpperCase();
            if (!(opcion.equals("SI"))) {
                salir = true;
            }
        } while (!salir);

    }

    public double buscarAlumno() {
        double promedio = 0;
        System.out.println("Ingrese el nombre que desea buscar");
        String nombre = leer.next();
        /*for (Alumnos aux : listaAlumnos) {
            if (aux.equals(nombre)) {
                promedio = notaFinal(nombre);
            }
        }*/

        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(nombre)) {
                promedio = notaFinal(i);
            }
        }
        return promedio;

    }

    public double notaFinal(int posicion) {
        double promedio = 0;
        System.out.println(listaAlumnos.get(posicion).getNombre());
        int nota1 = listaAlumnos.get(posicion).getNotas().get(0);
        int nota2 = listaAlumnos.get(posicion).getNotas().get(1);
        int nota3 = listaAlumnos.get(posicion).getNotas().get(2);
        promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;
    }

}
