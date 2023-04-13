/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class MovilServices {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {
        Movil m1 = new Movil();
        System.out.println("Ingrese la marca del teléfono celular");
        m1.setMarca(input.next());
        System.out.println("Ingrese el modelo del teléfono celular");
        m1.setModelo(input.next());
        System.out.println("Ingrese la memoria RAM del teléfono celular");
        m1.setMemoriaRam(input.nextInt());
        System.out.println("Ingrese el almacenamiento del teléfono celular");
        m1.setAlmacenamiento(input.nextInt());
        System.out.println("Ingrese el precio de venta del teléfono celular");
        m1.setPrecio(input.nextDouble());
        ingresarCodigo(m1);
        return m1;
    }

    public void ingresarCodigo(Movil m1) {
        int codigo = 0;
        String codigoTexto;
        do {
            System.out.println("Ingrese el código de siete dígitos del celular");

            codigo = input.nextInt();
            if(codigo<=999999 || codigo>9999999){
                System.out.println("El codigo ingresado es incorrecto, recuerde debe ser de siete dígitos");
            }
        } while (!(codigo > 999999) || !(codigo <= 9999999));
        
        codigoTexto = String.valueOf(codigo);
        for (int i = 0; i < 7; i++) {
            m1.getCodigo()[i] = Character.getNumericValue(codigoTexto.charAt(i));
        }

    }

    public void mostrarCodigo(Movil m1) {
        System.out.print("Código= ");
        for (int i = 0; i < 7; i++) {
            System.out.print(m1.getCodigo()[i]);
        }
        System.out.println("");
    }
}
