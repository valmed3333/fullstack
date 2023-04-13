/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class CursoServices {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c1) {
        for (int i = 0; i < c1.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del estudiante #" + (i + 1));
            c1.getAlumnos()[i] = input.next();

        }
    }

    public Curso crearCurso() {
        Curso c1 = new Curso();
        System.out.print("Ingrese el nombre del curso: ");
        c1.setNombreCurso(input.next());
        String turno;
        do {
            System.out.println("Ingrese el turno en el que será dictado:");
            System.out.println("(M)Mañana o (T)Tarde: ");
            turno = input.next().toUpperCase();
            if (turno.equals("M") || turno.equals("T")) {
                c1.setTurno(turno);
            } else {
                System.out.println("El dato ingresado es incorrecto.");
            }
        } while (!turno.equals("M") && !turno.equals("M"));
        System.out.print("Ingrese la cantidad de días por semana: ");
        c1.setCantidadDiasPorSemana(input.nextInt());
        System.out.print("Ingrese la cantidad de horas por día: ");
        c1.setCantidadHorasPorDia(input.nextInt());
        System.out.print("Ingrese el precio por hora de la clase: ");
        c1.setPrecioPorHora(input.nextDouble());
        cargarAlumnos(c1);
        calcularGananciaSemanal(c1);

        return c1;
    }
    public void calcularGananciaSemanal(Curso c1){
        double gananciaSemanal=c1.getCantidadDiasPorSemana()*c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getAlumnos().length;
        System.out.println("La ganancia semanal será de "+ gananciaSemanal + " $.");
    }
}
