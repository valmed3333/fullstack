/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import static java.lang.Math.random;



/**
 *
 * @author SimonValera
 */
public class Revolver {
    private int posActual, posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver(){
        
        posActual = (int) (Math.random()*6+1);
        posAgua = (int) (Math.random()*6+1);
        
    }
    
    public boolean mojar(){
        boolean mojado = false;
        if (posActual==posAgua) {
            mojado=true;
        }
        return mojado;
    }
    
    public void siguienteChorro(){
        posActual=posActual+1;
        if (posActual==7) {
            posActual=1;
        }
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    
    
    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
    
}
