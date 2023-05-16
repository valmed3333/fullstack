/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class ServiciosProducto {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> tienda = new HashMap();

    public Producto crearProducto() {
        Producto p1 = new Producto();
        System.out.println("Ingrese el nombre del producto");
        p1.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el precio del producto");
        p1.setPrecio(leer.nextDouble());

        return p1;
    }

    public void mostrarProductos() {

        if (tienda.size() > 0) {
            System.out.println("Los productos registrados en la tienda son los siguientes:");
            for (Map.Entry<String, Double> entry : tienda.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.println("( " + key + " | " + value + " )");
            }
        } else {
            System.out.println("No se encuentran productos registrados en la tienda");
        }

    }

    public void agregarProducto(Producto p1) {

        if (tienda.containsKey(p1.getNombre())) {
            System.out.println("El producto ya se encuentra registrado en la tienda");
        } else {
            tienda.put(p1.getNombre(), p1.getPrecio());
            System.out.println("El producto se agregó con exito");
        }
    }

    public void modificarPrecio() {
        Producto p2 = new Producto();
        System.out.println("Ingrese el producto al que desea cambiarle el precio");
        p2.setNombre(leer.next().toUpperCase());
        if (tienda.containsKey(p2.getNombre())) {
            System.out.println("El precio actual del producto es " + tienda.get(p2.getNombre()));
            System.out.println("Ingrese el nuevo precio del producto");
            p2.setPrecio(leer.nextDouble());
            tienda.replace(p2.getNombre(), p2.getPrecio());
            System.out.println("El nuevo precio se ha actualizado.");
        } else {
            System.out.println("El producto no se encuentra registrado en la tienda.");
        }
    }

    public void eliminarProducto() {
        String nombre;
        System.out.println("Ingrese el producto que desea eliminar del registro");
        nombre = leer.next().toUpperCase();
        if (tienda.containsKey(nombre)) {
            tienda.remove(nombre);
            System.out.println("El producto " + nombre + " se ha eliminado.");
        } else {
            System.out.println("El producto no se encuentra registrado en la tienda.");
        }
    }

    public void buscarPrecio() {
        String nombre;
        System.out.println("Ingrese el producto que desea consultar");
        nombre = leer.next().toUpperCase();
        if (tienda.containsKey(nombre)) {
            System.out.println("El precio de " + nombre + " es de " + tienda.get(nombre));
        } else {
            System.out.println("El producto no se encuentra registrado en la tienda.");
        }
    }

    public void menu() {
        boolean salir = false;

        int opcion = 0;

        do {
            System.out.println("\nBienvenido al Menú!!\nElija una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar los productos cargados en el sistema");
            System.out.println("3. Modificar precio de un producto");
            System.out.println("4. Buscar precio de un producto");
            System.out.println("5. Eliminar un producto");
            System.out.println("6. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(crearProducto());
                    break;
                case 2:
                    mostrarProductos();
                    esperar(1);
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    buscarPrecio();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 6:
                    salir = true;
                    break;

                default:
                    System.out.println("La opción ingresada no fue válida");
            }
            esperar(2);
        } while (salir == false);
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
