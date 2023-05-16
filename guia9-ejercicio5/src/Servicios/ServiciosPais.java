/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class ServiciosPais {

    Scanner leer = new Scanner(System.in);
    HashSet<Pais> conjuntoPaises = new HashSet();

    public Pais crearPais() {
        Pais p1 = new Pais();
        System.out.println("Ingrese el país");
        p1.setNombre(leer.next());

        return p1;
    }

    public void crearConjunto() {
        boolean salir = false;
        String opcion = "";
        do {
            conjuntoPaises.add(crearPais());

            System.out.println("Desea agregar otra país?: SI/NO");
            opcion = leer.next().toUpperCase();
            if (!(opcion.equals("SI"))) {
                salir = true;
            }
        } while (!salir);

    }

    public void mostrarPaises() {
        for (Pais aux : conjuntoPaises) {
            System.out.println(aux);
        }
    }

    public void ordenarPorAlfabeticamente() {
        ArrayList<Pais> listaPaisesOrdenados = new ArrayList(conjuntoPaises);
        Collections.sort(listaPaisesOrdenados, Comparator.comparing(Pais::getNombre));

        for (Pais aux : listaPaisesOrdenados) {
            System.out.println(aux);

        }
    }

    public void eliminarPais() {
        System.out.println("Ingrese el país a eliminar: ");
        String eliminar = leer.next();
        Pais paisEliminar = new Pais(eliminar);
        Boolean encontrado = false;

        Iterator<Pais> it = conjuntoPaises.iterator();
        while (it.hasNext()) {
            if (it.next().equals(paisEliminar)) {
                it.remove();
                encontrado = true;

            }

        }

        if (encontrado == false) {
            System.out.println("El país no se encuentra en el conjunto!");
        }
    }

    ;
    
    public void menu() {

        boolean salir = false;

        int opcion = 0;

        do {
            System.out.println("\nBienvenido al Menú!!\nElija una opción:");
            System.out.println("1. Crear conjunto de países");
            System.out.println("2. Mostrar los países ingresados");
            System.out.println("3. Ordenar la lista de países");
            System.out.println("4. Eliminar un país de la lista");
            System.out.println("5. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearConjunto();
                    break;
                case 2:
                    mostrarPaises();
                    break;
                case 3:
                    ordenarPorAlfabeticamente();
                    break;
                case 4:
                    eliminarPais();
                    break;
                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("La opción ingresada no fue válida");
            }

        } while (salir == false);

    }

}
