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
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, String color, double precio, char consumo, int peso) {
        super(color, precio, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }
    
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int cargaIn = leer.nextInt();
        carga=cargaIn;
        
        
    }

    @Override
    public String toString() {
        return "Lavadora{" + "color=" + color + ", precio=" + precio + ", consumo=" + consumo + ", peso=" + peso + ", carga=" + carga + '}';
    }

    


    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga>30){
            precio+=500;
        }
    }

}
