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
public class ServiciosAlumnos {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumnos> lista1 = new ArrayList();
    ArrayList<Alumnos> listaArg = new ArrayList();
    ArrayList<Alumnos> listaChi = new ArrayList();
    ArrayList<Alumnos> listaVen = new ArrayList();

    //Martin
    public void alta() {
        Alumnos a1 = new Alumnos();
        System.out.println("Ingrese el nombre del alumno que desea agregar");
        a1.setNombre(leer.next().toLowerCase());
        System.out.println("Ingrese el apellido del alumno que desea agregar");
        a1.setApellido(leer.next().toLowerCase());

        boolean nacionValida = false;
        while (nacionValida == false) {
            System.out.println("Ingrese la nacionalidad del alumno");
            a1.setNacionalidad(leer.next().toLowerCase());
            if (a1.getNacionalidad().equals("argentina") || a1.getNacionalidad().equals("chilena")
                    || a1.getNacionalidad().equals("venezolana")) {
                nacionValida = true;
            } else {
                System.out.println("La nacionalidad ingresada no es válida."
                        + "\nIntente con Argentina, Chilena o Venezolana.");
            }
        }
        int dia, mes, anio;
        System.out.println("Ingresaremos la fecha de nacimiento."
                + "\nPrimero indique el día de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año de nacimiento");
        anio = leer.nextInt() - 1900;

        a1.setFechaNacimiento(new Date(anio, mes, dia));
        System.out.println("El alumno se ha registrado de forma exitosa.");
        lista1.add(a1);
    }

    //Paula
    public void baja() {
        Alumnos a1 = new Alumnos();
        //Se registran los datos del alumno que deseamos eliminar
        System.out.println("Ingrese el Nombre del Alumno a eliminar");
        a1.setNombre(leer.next().toLowerCase());
        System.out.println("Ingrese el Apellido del Alumno a eliminar");
        a1.setApellido(leer.next().toLowerCase());
        System.out.println("Ingrese la nacionalidad del Alumno a eliminar");
        a1.setNacionalidad(leer.next().toLowerCase());
        System.out.println("Ingrese la Fecha de nacimiento del Alumno a eliminar");
        int dia, mes, anio;
        System.out.println("Primero indique el día de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año de nacimiento");
        anio = leer.nextInt() - 1900;

        a1.setFechaNacimiento(new Date(anio, mes, dia));

        //Se utiliza el iterator para borrar el alumno si se consigue en la lista 
        boolean existe = false;
        Iterator<Alumnos> it = lista1.iterator();
        while (it.hasNext()) {
            if (it.next().equals(a1)) {
                it.remove();
                existe = true;
                System.out.println("El alumno se ha dado de baja de forma exitosa.");
            }
        }
        if (existe = false) {
            System.out.println("El alumno no se encuentra registrado en la lista de alumnos.");
        }
    }

    //Ari
    public void modificar() {
        Alumnos a1 = new Alumnos();
        System.out.println("Ingrese el Nombre del Alumno a modificar");
        a1.setNombre(leer.next().toLowerCase());
        System.out.println("Ingrese el Apellido del Alumno a modificar");
        a1.setApellido(leer.next().toLowerCase());
        System.out.println("Ingrese la nacionalidad del Alumno a modificar");
        a1.setNacionalidad(leer.next().toLowerCase());
        System.out.println("Ingrese la Fecha de nacimiento del Alumno a modificar");
        int dia, mes, anio;
        System.out.println("Primero indique el día de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año de nacimiento");
        anio = leer.nextInt() - 1900;

        a1.setFechaNacimiento(new Date(anio, mes, dia));

        int i = 0;
        boolean existe = false;
        for (Alumnos aux : lista1) {
            ;
            if (aux.equals(a1)) {
                System.out.println("Ingrese el nuevo Nombre ");
                a1.setNombre(leer.next().toLowerCase());
                System.out.println("Ingrese el nuevo Apellido ");
                a1.setApellido(leer.next().toLowerCase());
                //Ingresar nacionalidad
                boolean nacionValida = false;
                while (nacionValida == false) {
                    System.out.println("Ingrese la nueva nacionalidad del alumno");
                    a1.setNacionalidad(leer.next().toLowerCase());
                    if (a1.getNacionalidad().equals("argentina") || a1.getNacionalidad().equals("chilena")
                            || a1.getNacionalidad().equals("venezolana")) {
                        nacionValida = true;
                    } else {
                        System.out.println("La nacionalidad ingresada no es válida."
                                + "\nIntente con Argentina, Chilena o Venezolana.");
                    }
                }
                System.out.println("Ingresaremos la fecha de nacimiento."
                        + "\nPrimero indique el día de nacimiento");
                dia = leer.nextInt();
                System.out.println("Ingrese el mes de nacimiento");
                mes = leer.nextInt() - 1;
                System.out.println("Ingrese el año de nacimiento");
                anio = leer.nextInt() - 1900;

                a1.setFechaNacimiento(new Date(anio, mes, dia));
                lista1.set(i, a1);
                existe = true;
                System.out.println("Los datos del alumno han sido actualizados con éxito");
            }

            i++;
        }
        if (existe == false) {
            System.out.println("El alumno no se encuentra registrado.");
        }

    }

    //Edward
    public void rellenarListaCorta() {
        lista1.add(new Alumnos("simon", "valera", "venezolana", new Date(1995 - 1900, 2 - 1, 2)));
        lista1.add(new Alumnos("ari", "perez", "argentina", new Date(1976 - 1900, 9 - 1, 6)));
        System.out.println("Lista de alumnos cargada con éxito.");
    }

    public void rellenarLista() {
        //Date fecha=new Date();

        //Alumnos ag =new Alumnos();
        lista1.add(new Alumnos("edward", "jobs", "argentina", new Date(1985 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("jose", "celis", "chile", new Date(1979 - 1900, 8 - 1, 4)));
        lista1.add(new Alumnos("pedro", "paz", "venezuela", new Date(1985 - 1900, 9 - 1, 5)));
        lista1.add(new Alumnos("martin", "toreto", "chile", new Date(1996 - 1900, 3 - 1, 6)));
        lista1.add(new Alumnos("diego", "jobs", "argentina", new Date(1980 - 1900, 6 - 1, 1)));
        lista1.add(new Alumnos("carlos", "zamora", "argentina", new Date(1940 - 1900, 9 - 1, 8)));
        lista1.add(new Alumnos("jesus", "cels", "argentina", new Date(1985 - 1900, 30 - 1, 8)));
        lista1.add(new Alumnos("camilo", "cartagena", "venezuela", new Date(1985 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("javier", "lopez", "argentina", new Date(1989 - 1900, 12 - 1, 5)));
        lista1.add(new Alumnos("mariano", "ury", "argentina", new Date(1945 - 1900, 4 - 1, 5)));
        lista1.add(new Alumnos("paola", "narvaez", "chile", new Date(2023 - 1900, 9 - 1, 30)));
        lista1.add(new Alumnos("tracy", "duque", "argentina", new Date(1985 - 1900, 12 - 1, 5)));
        lista1.add(new Alumnos("nataly", "zuluaga", "chile", new Date(2020 - 1900, 6 - 1, 8)));
        lista1.add(new Alumnos("sofia", "perez", "argentina", new Date(1996 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("lola", "camargo", "venezuela", new Date(1985 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("andres", "jara", "venezuela", new Date(1978 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("viviana", "rivera", "argentina", new Date(1996 - 1900, 9 - 1, 5)));
        lista1.add(new Alumnos("andreson", "rojas", "chile", new Date(1980 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("angela", "tttt", "chile", new Date(1999 - 1900, 8 - 1, 5)));
        lista1.add(new Alumnos("edward", "jose", "argentina", new Date(1937 - 1900, 8 - 1, 5)));
        System.out.println("Lista de alumnos cargada con éxito.");
        //return ag;
        
        rellenarListasNaciones();
    }

    //Simon
    public void mostrarLista() {
        System.out.println("\nLista de alumnos:");
        for (Alumnos aux : lista1) {
            System.out.println(aux);
        }

    }

    public void mostrarListaArg() {
        System.out.println("\nLista de alumnos argentinos:");
        for (Alumnos aux : listaArg) {
            System.out.println(aux);
        }

    }

    public void mostrarListaChi() {
        System.out.println("\nLista de alumnos chilenos:");
        for (Alumnos aux : listaChi) {
            System.out.println(aux);
        }

    }

    public void mostrarListaVen() {
        System.out.println("\nLista de alumnos venezolanos:");
        for (Alumnos aux : listaVen) {
            System.out.println(aux);
        }

    }

    //Tracy
    public void ordenAlfaApellidoAscendete() {
        Collections.sort(lista1, Comparator.comparing(Alumnos::getApellido));
        System.out.println("\nLa lista de alumnos se ha ordenado por apellido de forma ascendente.");
        /*for (Alumnos alumnoa1 : lista1) {
            System.out.println(alumnoa1);
        }*/
    }

    //
    public void ordenAlfaNombreDescendente() {
        Collections.sort(lista1, Comparator.comparing(Alumnos::getNombre).reversed());
        System.out.println("\nLa lista de alumnos se ha ordenado por nombre de forma descendente.");
    }

    //Alejandro
    public void mostrarEdad() {
        Alumnos a1 = new Alumnos();
        Date hoy = new Date();
        boolean existe = false;
        System.out.println("Ingrese el nombre del alumno que desea saber su edad");
        a1.setNombre(leer.next());

        for (Alumnos c : lista1) {
            String nombre = c.getNombre();
            if (nombre.equals(a1.getNombre())) {
                existe = true;
                if (hoy.getMonth() >= c.getFechaNacimiento().getMonth()) {
                    int edad = hoy.getYear() - c.getFechaNacimiento().getYear();
                    System.out.println(c + "\nSu edad es de " + edad + " años.");
                } else {
                    int edad = hoy.getYear() - c.getFechaNacimiento().getYear() - 1;
                    System.out.println(c + "\nSu edad es de " + edad + " años.");
                }

            }
        }

        if (existe == false) {
            System.out.println("El alumno buscado no se encuentra ");
        }

    }

    //
    public void rellenarListasNaciones() {
        listaArg.clear();
        listaChi.clear();
        listaVen.clear();
        for (Alumnos aux : lista1) {
            String nacion = aux.getNacionalidad();
            if (nacion.equals("argentina")) {
                listaArg.add(aux);
            } else if (nacion.equals("chile")) {
                listaChi.add(aux);
            } else {
                listaVen.add(aux);
            }
        }
        
    }

    public void menu() {
        boolean salir = false;

        int opcion = 0;

        do {
            System.out.println("\nBienvenido al Menú!!\nElija una opción:");
            System.out.println("1. Rellenar lista de alumnos");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Ordenar lista de alumnos por apellido de forma ascendente");
            System.out.println("4. Ordenar lista de alumnos por nombre de forma descendente");
            System.out.println("5. Crear listas de alumnos por nacionalidad");
            System.out.println("6. Mostrar lista de alumnos argentinos");
            System.out.println("7. Mostrar lista de alumnos chilenos");
            System.out.println("8. Mostrar lista de alumnos venezolanos");
            System.out.println("9. Dar de alta a un alumno");
            System.out.println("10. Dar de baja a un alumno");
            System.out.println("11. Modificar datos de un alumno");
            System.out.println("12. Mostrar edad de un alumno");
            System.out.println("13. Imprimir reporte final");
            System.out.println("14. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    rellenarLista();
                    break;
                case 2:
                    mostrarLista();
                    esperar(1);
                    break;
                case 3:
                    ordenAlfaApellidoAscendete();
                    break;
                case 4:
                    ordenAlfaNombreDescendente();
                    break;
                case 5:
                    rellenarListasNaciones();
                    System.out.println("Las listas de alumnos por nacionalidades se han creado de forma exitosa.");
                    break;
                case 6:
                    mostrarListaArg();
                    break;
                case 7:
                    mostrarListaChi();
                    break;
                case 8:
                    mostrarListaVen();
                    break;
                case 9:
                    alta();
                    rellenarListasNaciones();
                    break;
                case 10:
                    baja();
                    rellenarListasNaciones();
                    break;
                case 11:
                    modificar();
                    rellenarListasNaciones();
                    break;
                case 12:
                    mostrarEdad();
                    break;
                case 13:
                    reporteFinal();
                    break;
                case 14:
                    salir = true;
                    break;

                default:
                    System.out.println("La opción ingresada no fue válida");
                    break;
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

    //
    public void reporteFinal() {
        //Alumnos mayores de 25 años
        int mayorDe25 = 0, inicialApellido = 0, argentinos, chilenos, venezolanos;

        for (Alumnos aux : lista1) {
            Date hoy = new Date();
            int edad;
//Calculo basico de la edad, falta pulir el dia por si cumple años en el mes en curso
            if (hoy.getMonth() >= aux.getFechaNacimiento().getMonth()) {
                edad = hoy.getYear() - aux.getFechaNacimiento().getYear();
            } else {
                edad = hoy.getYear() - aux.getFechaNacimiento().getYear() - 1;
            }

            if (edad > 25) {
                mayorDe25++;
            }
        }

        //Alumnos que su apellido empieza por la letra L o P
        for (Alumnos aux : lista1) {
            char inicial = aux.getApellido().charAt(0);
            if (inicial == 'l' || inicial == 'p') {
                inicialApellido++;
            }
        }

        //Alumnos por nacionalidad
        argentinos = listaArg.size();
        chilenos = listaChi.size();
        venezolanos = listaVen.size();

        //Imprimimos el reporte final
        System.out.println("Total de estudiantes mayores de 25 años: "+ mayorDe25);
        System.out.println("Total de estudiantes cuya inicial del apellido es L o P: "
                + inicialApellido);
        System.out.println("Total de estudiantes argentinos: "+ argentinos);
        System.out.println("Total de estudiantes chilenos: "+ chilenos);
        System.out.println("Total de estudiantes venezolanos: "+ venezolanos);
        
    }

}
