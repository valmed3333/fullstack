/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Circunferencia {
    //definimos los atributos
    private double radio;

    
    //creamos los constructores
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    

    
    //creamos los gets and sets

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }


    
    
    
}
