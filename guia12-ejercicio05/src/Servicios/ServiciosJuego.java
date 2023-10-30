/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Jugador;
import java.util.*;

/**
 *
 * @author SimonValera
 */
public class ServiciosJuego {

    public void numeroAdivinar(Jugador j1) {
        int numero = (int) (Math.random() * 500);
        System.out.println(numero);
        j1.setNumeroAdivinar(numero);
        j1.setIntentos(1);
    }

    public boolean jugar(Jugador j1) throws JuegoExcepcion {
        boolean gano = false;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su intento");

        try {
            
            int num = leer.nextInt();
            if(num>500){
                throw new JuegoExcepcion("El número ingresado es mayor que 500");
            }
            if(num<1){
                throw new JuegoExcepcion("El número ingresado es menor que 1");
                
            }
            
            
            if (num == j1.getNumeroAdivinar()) {
                System.out.println("Felicidades ha acertado en su intento número "
                        + j1.getIntentos());
                gano = true;
            } else if (num > j1.getNumeroAdivinar()) {
                System.out.println("El número ingresado es mayor que el número a adivinar");
            } else {
                System.out.println("El número ingresado es menor que el número a adivinar");

            }
            
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es un número entero");
            
        } catch(JuegoExcepcion e){
            System.out.println(e.getMessage());;
        }finally{
            j1.setIntentos(j1.getIntentos() + 1);
        }

        return gano;
    }
}
