package Servicios;

import Persona.Persona;
import java.util.Scanner;

public class Servicios {

    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.print("Ingresa tu nombre");
        System.out.println(" ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingresa tu edad");
        p1.setEdad(leer.nextInt());
        esMayorDeEdad();
        System.out.println("Ingresa tu sexo");
        System.out.println("Opciones: H-M-O");
        boolean sal = false;
        while (!sal) {
            p1.setSexo(leer.next().toUpperCase().charAt(0));
            if (p1.getSexo() == 'H' || p1.getSexo() == 'M' || p1.getSexo() == 'O') {
                sal = true;
            } else {
                System.out.println("Dato incorrecto. Intenta denuevo");
            }
        }
        System.out.println("Ingresa tu altura");
        p1.setAltura(leer.nextDouble());
        
        System.out.println("Ingresa tu peso");
        p1.setPeso(leer.nextDouble());
        calcularIMC();
        leer.nextLine();

        return p1;
    }

    public void calcularIMC() {
        double imc = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        if (imc < 20) {
            System.out.println("Estas por debajo de tu peso ideal");
            System.out.println("-1");
        } else if (imc > 25) {
            System.out.println("Estas por encima de tu peso ideal");
            System.out.println("1");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Estas en tu peso ideal");
            System.out.println("0");
        }
    }

    public void esMayorDeEdad() {
        boolean verifica = false;
        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
            System.out.println(verifica = true);
        } else {
            System.out.println("Es menor de edad");
            System.out.println(verifica);
        }
    }
}
