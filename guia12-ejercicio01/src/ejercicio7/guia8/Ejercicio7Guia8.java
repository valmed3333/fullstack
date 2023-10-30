/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.guia8;

import Entidades.Persona;
import Services.PersonaServices;

/**
 *
 * @author SimonValera
 */
public class Ejercicio7Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServices ps = new PersonaServices();

        try {
            //Persona p1 = new Persona(null, null, null, null, null);
            //System.out.println(p1);
            //ps.esMayorDeEdad(p1);
        } catch (RuntimeException e) {
            System.out.println("La persona no se puede crear con valores nulos");
        }

        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();

        int[] rIMC = new int[4];
        rIMC[0] = ps.calcularIMC(p1);
        rIMC[1] = ps.calcularIMC(p2);
        rIMC[2] = ps.calcularIMC(p3);
        rIMC[3] = ps.calcularIMC(p4);
        boolean[] rMayorOMenor = new boolean[4];
        rMayorOMenor[0] = ps.esMayorDeEdad(p1);
        rMayorOMenor[1] = ps.esMayorDeEdad(p2);
        rMayorOMenor[2] = ps.esMayorDeEdad(p3);
        rMayorOMenor[3] = ps.esMayorDeEdad(p4);
        int IMCBajoMayor = 0, IMCNormalMayor = 0, IMCAltoMayor = 0, IMCBajoMenor = 0, IMCNormalMenor = 0, IMCAltoMenor = 0;

        for (int i = 0; i < 4; i++) {
            if (rIMC[i] == -1 && rMayorOMenor[i] == false) {
                IMCBajoMenor++;
            } else if (rIMC[i] == -1 && rMayorOMenor[i] == true) {
                IMCBajoMayor++;
            } else if (rIMC[i] == 0 && rMayorOMenor[i] == false) {
                IMCNormalMenor++;
            } else if (rIMC[i] == 0 && rMayorOMenor[i] == true) {
                IMCNormalMayor++;
            } else if (rIMC[i] == 1 && rMayorOMenor[i] == false) {
                IMCAltoMenor++;
            } else {
                IMCAltoMayor++;
            }
        }
        

        System.out.println("A continuación se muestran los porcentajes de las condiciones de las personas evaluadas:");
        System.out.println("1.Personas que están por debajo de su peso ideal y son menores de edad " + (IMCBajoMenor*100 / 4) + "%");
        System.out.println("2.Personas que están por debajo de su peso ideal y son mayores de edad " + (IMCBajoMayor*100 / 4) + "%");
        System.out.println("3.Personas que están en su peso ideal y son menores de edad " + (IMCNormalMenor*100 / 4) + "%");
        System.out.println("4.Personas que están en su peso ideal y son mayores de edad " + (IMCNormalMayor*100 / 4) + "%");
        System.out.println("5.Personas que están por encima de su peso ideal y son menores de edad " + (IMCAltoMenor*100 / 4) + "%");
        System.out.println("6.Personas que están por encima de su peso ideal y son mayores de edad " + (IMCAltoMayor*100 / 4) + "%");
    }

}
