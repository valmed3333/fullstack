package poo7;

import Servicios.Servicios;
import Persona.Persona;

public class Poo7 {

    public static void main(String[] args) {
        Servicios s1 = new Servicios();
        Persona[] personas = new Persona[4];
        //Persona p3=s1.Per();
        //Persona p4=s1.Per();
        double suma = 0;//contador para edad mayor
        double sum = 0;//contador para edad menor
        double pesm = 0;// contador para peso por debajo
        double pesM = 0;// contador para peso por encima
        double pesI = 0;// contador para peso ideal

        for (int i = 0; i < 4; i++) {
            personas[i] = s1.crearPersona();
            if (personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2) < 20) {
                pesm++;
            }
            if (personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2)>= 20 && personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2) <= 25) {
                pesI++;
            }
            if (personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2)> 25) {
                pesM++;
            }
            if (personas[i].getEdad() >= 18) {
                suma++;
            } else if (personas[i].getEdad() < 18) {
                sum++;
            }
        }
        double porcPesm=pesm/4*100;
        System.out.println("El porcentaje de personas con peso menor es: "+porcPesm+"%");
        double porcPesI=pesI/4*100;
        System.out.println("El porcentaje de personas con peso ideal es: "+porcPesI+"%");
        double porcPesM=pesM/4*100;
        System.out.println("El porcentaje de personas con peso mayor es: "+porcPesM+"%");
        double porcEdadM = suma / 4 * 100;//M mayuscula para mayores
        System.out.println("El porcentaje de personas con edad mayor es: " + porcEdadM + "%");
        double porcEdadm = suma / 4 * 100;//m minuscula para menores
        System.out.println("El porcentaje de personas con edad menor es: " + porcEdadm + "%");
    }
}
/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personascuantas
están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
