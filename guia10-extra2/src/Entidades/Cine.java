/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.*;

/**
 *
 * @author SimonValera
 */
public class Cine {

    private Pelicula pelicula;
    private double precio;
    private String[][] asientos = new String[][]{
        {"8 A  ", "8 B  ", "8 C  ", "8 D  ", "8 E  ", "8 F  "},
        {"7 A  ", "7 B  ", "7 C  ", "7 D  ", "7 E  ", "7 F  "},
        {"6 A  ", "6 B  ", "6 C  ", "6 D  ", "6 E  ", "6 F  "},
        {"5 A  ", "5 B  ", "5 C  ", "5 D  ", "5 E  ", "5 F  "},
        {"4 A  ", "4 B  ", "4 C  ", "4 D  ", "4 E  ", "4 F  "},
        {"3 A  ", "3 B  ", "3 C  ", "3 D  ", "3 E  ", "3 F  "},
        {"2 A  ", "2 B  ", "2 C  ", "2 D  ", "2 E  ", "2 F  "},
        {"1 A  ", "1 B  ", "1 C  ", "1 D  ", "1 E  ", "1 F  "},};

    ;

    public Cine() {
    }

    public Cine(Pelicula pelicula, double precio, String[][] asientos) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.asientos = asientos;

    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", asientos=" + asientos + '}';
    }

    public void crearSalaLlena() {
        String[][] puestos = {
            {"8 A X", "8 B X", "8 C X", "8 D  ", "8 E X", "8 F X"},
            {"7 A X", "7 B X", "7 C X", "7 D X", "7 E  ", "7 F X"},
            {"6 A X", "6 B X", "6 C  ", "6 D X", "6 E X", "6 F  "},
            {"5 A X", "5 B X", "5 C X", "5 D X", "5 E X", "5 F X"},
            {"4 A X", "4 B X", "4 C X", "4 D X", "4 E X", "4 F X"},
            {"3 A X", "3 B X", "3 C X", "3 D  ", "3 E X", "3 F X"},
            {"2 A X", "2 B  ", "2 C X", "2 D X", "2 E X", "2 F  "},
            {"1 A X", "1 B X", "1 C X", "1 D X", "1 E X", "1 F X"},};
        setAsientos(puestos);

    }

    public void mostrarSala() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void asignarAsiento() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        boolean encontrado = false;
        String puesto;
        do {
            mostrarSala();
            System.out.println("Indique el puesto que desea");
            puesto = leer.next().toUpperCase();
            if (puesto.length() == 2) {
                puesto = puesto.charAt(0) + " " + puesto.charAt(1);
            }

            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; j++) {
                    if (asientos[i][j].contains(puesto)) {
                        if (asientos[i][j].contains("X")) {
                            System.out.println("El puesto se encuentra ocupado, "
                                    + "inténtelo de nuevo.");
                            encontrado = true;
                        } else {
                            System.out.println("Su nuevo asiento es el " + asientos[i][j]);
                            asientos[i][j] = asientos[i][j].substring(0, asientos[i][j].length() - 1) + "X";
                            salir = true;
                            encontrado = true;
                        }
                    }
                }

            }
            if (encontrado == false) {
                System.out.println("El asiento ingresado no es válido");
            }

        } while (salir == false);

    }

    public boolean validarRequisitos(Espectador e1) {
        boolean aprobado = false;
        if (e1.getEdad() < pelicula.getEdadMinima()) {
            System.out.println("El espectador no cumple con la edad mínima"
                    + " para ver " + pelicula.getTitulo() + " vuelva en unos "
                    + "años.");
        } else {
            if (precio > e1.getDineroDisponible()) {
                System.out.println("Saldo insuficiente, inténtelo de nuevo.");
            } else {
                aprobado = true;
            }
        }
        return aprobado;
    }

    public void comprarEntrada(Espectador e1) {
        if (validarRequisitos(e1)) {
            asignarAsiento();
        }

    }
}
