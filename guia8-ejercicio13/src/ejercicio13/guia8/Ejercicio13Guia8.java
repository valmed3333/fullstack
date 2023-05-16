/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.guia8;

import Entidades.Curso;
import Services.CursoServices;

/**
 *
 * @author SimonValera
 */
public class Ejercicio13Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServices cs = new CursoServices();
        Curso c1 = new Curso();
        c1 = cs.crearCurso();
    }

}
