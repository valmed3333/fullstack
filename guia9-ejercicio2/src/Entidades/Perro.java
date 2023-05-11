/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author SimonValera
 */
public class Perro {

    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return true;
    }

    
    
    

    public static Comparator<Perro> compararRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return p1.getRaza().compareTo(p2.getRaza());
        }

    };
    
}
