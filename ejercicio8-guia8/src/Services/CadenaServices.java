/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class CadenaServices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena c1) {
        int vocales = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {

            char ca = c1.getFrase().toUpperCase().charAt(i);
            if (ca == 'A' || ca == 'E' || ca == 'I' || ca == 'O' || ca == 'U') {
                vocales++;
            }

            /*switch (c1.getFrase().toUpperCase().charAt(i)) {
                case 'A':
                    vocales++;
                    break;
                case 'E':
                    vocales++;
                    break;
                case 'I':
                    vocales++;
                    break;
                case 'O':
                    vocales++;
                    break;
                case 'U':
                    vocales++;
                    break;

            }*/
        }
        System.out.println("La frase tiene " + vocales + " vocales.");
    }

    public void invertirFrase(Cadena c1) {
        String fraseInvertida = "";
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + c1.getFrase().charAt(i);

        }
        System.out.println(fraseInvertida);
    }

    public void vecesRepetido(Cadena c1, String letra) {

        //String frase = c1.getFrase();
        // Contar cuántas veces se repite el carácter en la frase
        int contador = 0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if (c1.getFrase().toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(Cadena c1) {
        System.out.print("Ingrese la frase que desea comparar: ");
        String frase2 = leer.next();
        String frase = c1.getFrase();
        if (frase.length() == frase2.length()) {
            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases tienen longitudes diferentes.");
        }

    }
    
    public void unirFrases(Cadena c1){
        System.out.print("Ingrese la frase que desea unir: ");
        String frase2 = leer.next();
        String frase = c1.getFrase();
        System.out.println(frase.concat(" "+frase2));
        System.out.println(frase+" "+frase2);
    }
    public void reemplazar(Cadena c1){
        System.out.print("Ingrese el carácter por el que desea sustituir las a: ");
        char char2 = leer.next().charAt(0);
        String reemplazar = c1.getFrase().replace('a', char2);
        reemplazar = reemplazar.replace('A', char2);
        System.out.println(reemplazar);
    }
    public boolean contiene(Cadena c1){
        System.out.print("Ingrese el carácter que desea buscar: ");
        String char2 = leer.next();
        boolean contiene=false;
        contiene=c1.getFrase().toUpperCase().contains(char2.toUpperCase().subSequence(0, 1));
        
        
        System.out.println(contiene);
        
        return contiene;
    }
}
