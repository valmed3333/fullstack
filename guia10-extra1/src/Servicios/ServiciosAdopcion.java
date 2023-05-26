/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.*;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class ServiciosAdopcion {

    private Scanner leer = new Scanner(System.in);

    //Se crea una lista para añadir a todos los perros y personas
    List<Perro> mascotas = new ArrayList();
    List<Persona> personas = new ArrayList();

    public void cargaInicial() {
        List<Perro> l1 = new ArrayList();
        List<Perro> l2 = new ArrayList();

        Persona p1 = new Persona("martin", "lamas", 42, 12345678);
        Persona p2 = new Persona("natali", "paz", 34, 23456789);
        p1.setPerros(l1);
        p2.setPerros(l2);
        personas.add(p1);
        personas.add(p2);
        Persona vacio = new Persona();
        vacio.setNombre("sin adoptar");

        Perro m1 = new Perro("chiquito", "catumpi", "mediano", 3, vacio);
        Perro m2 = new Perro("filomeno", "boxer", "grande", 6, vacio);
        Perro m3 = new Perro("layka", "puddle", "chiquito", 5, vacio);
        mascotas.add(m1);
        mascotas.add(m2);
        mascotas.add(m3);
    }

    public void menu() {
        boolean salir = false;
        cargaInicial();
        do {
            System.out.println("Bienvenid@, selecciona una opción:");
            esperar(1);
            System.out.println("1. Agregar una persona nueva");
            System.out.println("2. Agregar un perro nuevo");
            System.out.println("3. Adoptar mascota");
            System.out.println("4. Mostrar estado de adopción de los perros");
            System.out.println("5. Mostrar lista de personas");
            System.out.println("6. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarPersonas();
                    break;
                case 2:
                    agregarMascotas();
                    break;
                case 3:
                    adoptarMascota();
                    break;
                case 4:
                    mascotasAdoptadas();
                    break;
                case 5:
                    mostrarPersonas();
                    break;
                case 6:
                    salir = true;
                    mascotasAdoptadas();
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
            esperar(2);
        } while (salir == false);

    }

    public void agregarPersonas() {
        boolean salir = false;
        do {

            System.out.println("Desea agregar una persona nueva?");
            String opcion = leer.next().toUpperCase();
            if (opcion.equals("SI")) {
                Persona p3 = new Persona();
                List<Perro> l1 = new ArrayList();
                System.out.println("Ingrese el nombre de la persona");
                p3.setNombre(leer.next());
                System.out.println("Ingrese el apellido de la persona");
                p3.setApellido(leer.next());
                System.out.println("Ingrese el Dni de la persona");
                p3.setDni(leer.nextInt());
                System.out.println("Ingrese la edad de la persona");
                p3.setEdad(leer.nextInt());
                p3.setPerros(l1);
                personas.add(p3);
                System.out.println("Persona añadida con exito ");

            } else if (opcion.equals("NO")) {
                System.out.println("De acuerdo.");
                salir = true;
            } else {
                System.out.println("Opcion invalida");
            }

        } while (salir == false);
        mostrarPersonas();
        System.out.println("");
    }

    public void mostrarPersonas() {
        for (Persona aux : personas) {
            System.out.println(aux);
            System.out.println("");
        }
    }

    public void agregarMascotas() {
        boolean salir = false;

        do {

            System.out.println("Desea agregar un perro nuevo?");
            String opcion = leer.next().toUpperCase();
            if (opcion.equals("SI")) {
                Perro m4 = new Perro();
                System.out.println("Ingrese el nombre del perro");
                m4.setNombre(leer.next());
                System.out.println("Ingrese la raza del perro");
                m4.setRaza(leer.next());
                System.out.println("Ingrese el tamaño del perro");
                m4.setTamano(leer.next());
                System.out.println("Ingrese la edad del perro");
                m4.setEdad(leer.nextInt());
                mascotas.add(m4);
                System.out.println("Perro añadido con exito ");

            } else if (opcion.equals("NO")) {
                System.out.println("De acuerdo.");
                salir = true;
            } else {
                System.out.println("Opcion invalida");
            }
        } while (salir == false);
        mostrarMascotas();
    }

    public void mostrarMascotas() {
        for (Perro mascota : mascotas) {
            System.out.println(mascota);
        }
    }

    public void adoptarMascota() {
        System.out.println("Ingrese el nombre de la persona que desea adoptar una mascota:");
        String nombre = leer.next();

        if (validarPersona(nombre)) {
            Persona adoptante = quienAdopta(nombre);
            System.out.println("A continuación podra ver la lista de perros que tenemos en adopción");
            mostrarMascotas();
            System.out.println("Desea adoptar alguno?");
            String adopta = leer.next().toUpperCase();
            if (adopta.equals("SI")) {
                System.out.println("Ingrese el nombre del perro que desea adoptar");
                String a1 = leer.next();
                if (validarMascota(a1, adoptante) == false) {
                    System.out.println("El perro ingresado no se encuentra en nuestra base de datos");
                }
            } else if (adopta.equals("NO")) {
                System.out.println("De acuerdo.");
            } else {
                System.out.println("Opción ingresada inválida");
            }
        } else {
            System.out.println("La persona no se encuentra cargada en nuestra base de datos.");
        }

    }

    public boolean validarPersona(String nombre) {
        boolean existe = false;
        for (Persona aux : personas) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }

        return existe;
    }

    public Persona quienAdopta(String nombre) {
        int posicion = 0;
        Persona adopta = new Persona();
        for (Persona aux : personas) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                adopta = personas.get(posicion);
            }
            posicion++;
        }
        return adopta;

    }

    public boolean validarMascota(String nombre, Persona adoptante) {
        boolean adoptado = false;

        for (Perro aux : mascotas) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                if (aux.getDueño().getNombre().equalsIgnoreCase("sin adoptar")) {
                    aux.setDueño(adoptante);
                    setResponsable(aux);
                    setNuevaMascota(aux, adoptante);

                    System.out.println(aux.getNombre() + " ha sido adoptado por "
                            + aux.getDueño().getNombre() + " con éxito. ");
                    adoptado = true;
                } else {
                    System.out.println(aux.getNombre() + " ya fue adoptado por "
                            + aux.getDueño().getNombre());
                    adoptado = true;
                }
            }
        }

        return adoptado;
    }

    public void setResponsable(Perro m1) {
        int pos = 0;
        for (Perro aux : mascotas) {
            if (m1.getNombre().equalsIgnoreCase(aux.getNombre())) {
                mascotas.set(pos, m1);
            }
            pos++;
        }
    }

    public void setNuevaMascota(Perro aux, Persona adoptante) {
        int pos = 0;
        for (Persona p1 : personas) {
            if (adoptante.getNombre().equalsIgnoreCase(p1.getNombre())) {
                List<Perro> l3 = p1.getPerros();
                l3.add(aux);
                p1.setPerros(l3);

            }
            pos++;
        }
    }

    public void mascotasAdoptadas() {
        for (Perro mascota : mascotas) {
            if (mascota.getDueño().getNombre().equalsIgnoreCase("sin adoptar")) {
                System.out.println(mascota.getNombre() + " de raza " + mascota.getRaza()
                        + ", de tamaño " + mascota.getTamano() + " y de "
                        + mascota.getEdad() + " años no ha sido adoptado.");
            } else {
                System.out.println(mascota.getNombre() + " de raza " + mascota.getRaza()
                        + ", de tamaño " + mascota.getTamano() + " y de "
                        + mascota.getEdad() + " años ha sido adoptado por "
                        + mascota.getDueño().getNombre());
            }
            esperar(3);
        }
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
