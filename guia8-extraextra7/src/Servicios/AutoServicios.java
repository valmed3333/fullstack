/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Auto;
import java.util.Scanner;

/**
 *
 * @author Paula Cely
 * version con modificaciones menores para funcionar con mi entidad Simon Valera
 */
public class AutoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Auto A1 = new Auto();
    VerificacionFecha vf = new VerificacionFecha();

    /*Que un usuario cargue su ficha del auto.*/
    public Auto crearAuto() {
        System.out.println("Ingresa el nombre del propietario del vehículo:");
        A1.setPropietario(leer.next());
        A1.setVencimiento(vf.crearFecha());
        System.out.println("Ingresa el color del vehículo: ");
        A1.setColor(leer.next());
        System.out.println("Ingrese el modelo del vehículo: ");
        A1.setModelo(leer.next());

        return A1;
    }

    /*Que el usuario, modifique la titularidad del vehículo.*/
    public void cambioTitularidad() {
        System.out.println("El nombre del propietario actual del vehículo es: " + A1.getPropietario()+ ", ¿Deseas cambiarlo? Responde SI O NO");
        String respuesta = leer.next().toUpperCase();

        if (respuesta.equals("SI")) {
            System.out.println("Ingresa el nombre del nuevo propietario: ");
            A1.setPropietario(leer.next());
            System.out.println("El nuevo propietario del vehículo es: " + A1.getPropietario()+ ".");
        } else {
            System.out.println("El propietario del vehículo es: " + A1.getPropietario());
        }

    }

    public void kmRecorrido() {
        System.out.println("Ingresa el kilometraje recorrido durante tu último viaje: ");
        A1.setKm(A1.getKm() + leer.nextInt());
        System.out.println("El nuevo kilometraje es de: " + A1.getKm() + " Kms.");
    }

    /*Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/
    public void verificacionService() {
        if (A1.getKm() > 10000) {
            System.out.println("Es momento de realizar tu mantenimiento preventivo.");
        } else if (A1.getKm() >= 9000) {
            System.out.println("Te faltan " + (10000 - A1.getKm()) + " Kms para realizar tu mantenimiento preventivo.");

        }
    }

    public void menu() {
        boolean salir = false;

        do {
            System.out.println("Bienvenidos al instituto EGG de transporte");
            System.out.println("Selecciona una opción del menú:"
                    + "\n1.Registrar vehículo"
                    + "\n2.Cambio de Titular del vehículo"
                    + "\n3.Registrar Kilometraje"
                    + "\n4.Verificar mantenimiento "
                    + "\n5.Salir");
            System.out.println("");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    A1 = crearAuto();
                    break;
                case 2:
                    cambioTitularidad();
                    break;
                case 3:
                    kmRecorrido();
                    break;
                case 4:
                    verificacionService();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intentelo nuevamente.");
            }

        } while (!salir);
    }

}
