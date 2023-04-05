/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class CafeteraServices {

    private Scanner input = new Scanner(System.in);

    public Cafetera crearCafetera() {
        System.out.println("Ingrese la capacidad máxima de café que puede contener la cafetera");
        int capacidad = input.nextInt();
        System.out.println("Ingrese la cantidad actual de café que hay en la cafetera");
        int cantidad = input.nextInt();
        return new Cafetera(capacidad, cantidad);

    }

    public void llenarCafetera(Cafetera c1) {
        System.out.println("Se ha llenado la cafetera con " + (c1.getCapacidadMaxima() - c1.getCantidadActual()) + " onzas de café.");
        c1.setCantidadActual(c1.getCapacidadMaxima());

    }

    public void mostrarCantidad(Cafetera c1) {
        System.out.println("La cantidad actual de cafe es de " + c1.getCantidadActual() + " onzas");
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera c1) {
        System.out.println("¿Qué cantidad de onzas de café quieres adicionar a la cafetera?");
        int adicionCafe = input.nextInt();

        if (adicionCafe + c1.getCantidadActual() <= c1.getCapacidadMaxima()) {
            c1.setCantidadActual(c1.getCantidadActual() + adicionCafe);
            System.out.println("Se adicionó: " + adicionCafe + " onzas, y la cantidad actual es: " + c1.getCantidadActual() + " onzas");
        } else {
            System.out.println("No se puede adicionar esa cantidad de café, porque sobrepasa la capacidad máxima");
        }
    }

    public void menu(Cafetera c1) {
        CafeteraServices cs = new CafeteraServices();
        boolean salir = false;
        int option;
        while (!salir) {
            System.out.println("Bienvenido al menú");
            System.out.println("Ingrese una opción:");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Mostrar cantidad actual de café");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Servir taza");
            System.out.println("6. Salir");
            option = input.nextInt();
            switch (option) {
                case 1:
                    cs.llenarCafetera(c1);
                    break;
                case 2:
                    cs.mostrarCantidad(c1);
                    break;
                case 3:
                    cs.vaciarCafetera(c1);
                    break;
                case 4:
                    cs.agregarCafe(c1);
                    break;
                case 5:
                    cs.servirTaza(c1);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida, inténtelo de nuevo.");
                    break;
            }

        }

    }

    public void servirTaza(Cafetera c1) {

        int tamano = 0;
        boolean error = true;
        while (error) {
            System.out.println("Que tamaño desea, seleccione una opción: 1. 4 onzas, 2. 8 onzas, y 3. 12 onzas");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    tamano = 4;
                    error = false;
                    break;
                case 2:
                    tamano = 8;
                    error = false;
                    break;
                case 3:
                    tamano = 12;
                    error = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, inténtelo de nuevo");
            }
        }
        if (c1.getCantidadActual() >= tamano) {
            c1.setCantidadActual(c1.getCantidadActual() - tamano);
            System.out.println("Se sirvió un café de " + tamano + " onzas ");
            System.out.println("La cantidad actual de café en la cafetera es de: " + c1.getCantidadActual() + " onzas");
        } else {
            System.out.println("No alcanza para servir la taza, se le sirvieron: " + c1.getCantidadActual() + " onzas");
            c1.setCantidadActual(0);
        }

    }
}
