/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author SimonValera
 */
public class Electrodomestico {

    protected String color;
    protected double precio;
    protected char consumo;
    protected int peso;

    public Electrodomestico(String color, double precio, char consumo, int peso) {
        this.color = comprobarColor(color);
        this.precio = precio;
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = comprobarConsumoEnergetico(consumo);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", precio=" + precio + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E'
                || letra == 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        color = color.toUpperCase();
        if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO")
                || color.equals("AZUL") || color.equals("GRIS")) {
            return color;
        } else {
            return "BLANCO";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodomestico");
        String colorIn = comprobarColor(leer.next());
        color = colorIn;
        System.out.println("Ingrese el consumo del electrodomestico");
        char consumoIn = comprobarConsumoEnergetico(leer.next().charAt(0));
        consumo = consumoIn;
        System.out.println("Ingrese el peso del electrodomestico");
        int pesoIn = leer.nextInt();
        peso = pesoIn;
        precio = 1000;
        //precioFinal();
    }

    public void precioFinal() {

        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }

        if (peso <= 19) {
            precio += 100;
        } else if (peso <= 49) {
            precio += 500;
        } else if (peso <= 79) {
            precio += 800;
        } else{
            precio += 1000;
        }

    }
}


