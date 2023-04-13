/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.guia8.v2;

import Entidades.Persona;
import Services.PersonaServices;

/**
 *
 * @author SimonValera
 */
public class Ejercicio7Guia8v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServices ps = new PersonaServices();
        int participantes = 4;
        Persona[] p = new Persona[participantes];
       
        int IMCBajoMayor = 0, IMCNormalMayor = 0, IMCAltoMayor = 0, IMCBajoMenor = 0, IMCNormalMenor = 0, IMCAltoMenor = 0;

        for (int i = 0; i < participantes; i++) {
            p[i]=ps.crearPersona();
            p[i].setrIMC(ps.calcularIMC(p[i]));
            p[i].setMayorDeEdad(ps.esMayorDeEdad(p[i]));
            
            if (p[i].getrIMC() == -1 && p[i].isMayorDeEdad() == false) {
                IMCBajoMenor++;
            } else if (p[i].getrIMC() == -1 && p[i].isMayorDeEdad() == true) {
                IMCBajoMayor++;
            } else if (p[i].getrIMC() == 0 && p[i].isMayorDeEdad() == false) {
                IMCNormalMenor++;
            } else if (p[i].getrIMC() == 0 && p[i].isMayorDeEdad() == true) {
                IMCNormalMayor++;
            } else if (p[i].getrIMC() == 1 && p[i].isMayorDeEdad() == false) {
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
