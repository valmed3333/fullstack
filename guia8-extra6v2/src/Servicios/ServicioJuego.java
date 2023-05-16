/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Ahorcado.Ahorcado;
import java.util.*;

/**
 *
 * @author npazp
 */
public class ServicioJuego {

    Ahorcado A1 = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    Set<Character> yaingreso=new HashSet<>();

    public void CrearJuego() {

        System.out.println("Ingrese una palabra:");
        String palabraUsuario = leer.nextLine().toLowerCase();
        //le damos el mismo valor de la longitud a la cantidad de jugadas para evitar colocar un numero demasiado grande
        A1.setCantidadJugadas(palabraUsuario.length());
        A1.setTemp(new char[palabraUsuario.length()]);
        A1.setPalabra(new char[palabraUsuario.length()]);
        for (int i = 0; i < palabraUsuario.length(); i++) {
            char reemplazo = palabraUsuario.charAt(i);
            A1.getPalabra()[i] = reemplazo;
        }

        A1.setCantidadLetras(0);

    }

    public int MetodoLongitud() {

        int long1 = A1.getPalabra().length;
        return long1;
    }

    public void BuscarLetra(char letra) {
        boolean encontrar = false;
        for (int i = 0; i < MetodoLongitud(); i++) {
            if (A1.getPalabra()[i] == letra) {
               A1.getTemp()[i]=A1.getPalabra()[i];
                encontrar = true;
            }
        }
            if (encontrar) {
                System.out.println("La letra " + letra + " es parte de la palabra");
                System.out.println(encontrar);
            } else {
                System.out.println("La letra " + letra + " no es parte de la palabra");
                System.out.println(encontrar);
                A1.setCantidadJugadas(A1.getCantidadJugadas() - 1);
            
        }
    }

    public void encontradas(char letra) {
        for (int i = 0; i < MetodoLongitud(); i++) {
            if (A1.getPalabra()[i] == letra) {
                if(A1.getTemp()[i]==letra){
                A1.setCantidadLetras(A1.getCantidadLetras() + 1);
            }
            }
        }
        System.out.println("Se han encontrado: " + A1.getCantidadLetras() + " Faltantes: " + (MetodoLongitud() - A1.getCantidadLetras()));
    }

    public void intentos() {
        System.out.println("Numero de oportunidades restantes: " + A1.getCantidadJugadas());
    }
    public void adivinaste(){
        
    }

    public Ahorcado Juego() {
      
        CrearJuego();
        do {
            System.out.println("Ingrese una letra");
            char letra = leer.next().toLowerCase().charAt(0);
            if(yaingreso.contains(letra)){
                System.out.println("Ya ingreso esa letra. intente con otra");
            }else{
            yaingreso.add(letra);
            System.out.println("Longitud de la palabra: " + MetodoLongitud());
            BuscarLetra(letra);
            encontradas(letra);
            intentos();
            }
        } while (A1.getCantidadJugadas() > 0&&MetodoLongitud()!=A1.getCantidadLetras()&&A1.getPalabra()!=A1.getTemp());
        if(A1.getCantidadJugadas()==0){
            System.out.println("¡Has Perdido!");
        }else{
            System.out.println("Acertaste la palabra ¡Felicidades!");
        }
        return A1;
    }

}
