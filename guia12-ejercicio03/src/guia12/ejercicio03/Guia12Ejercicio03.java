package guia12.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Guia12Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero dn = new DivisionNumero();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        String num1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        String num2 = leer.next();
        dn.DivisionNumero(num1, num2);
    }

//      Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//      números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//      para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//      una división con los dos numeros y mostrar el resultado.
}
