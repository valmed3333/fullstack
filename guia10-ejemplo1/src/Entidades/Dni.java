/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author SimonValera
 */
public class Dni {
    private char serie;
    private int num;

    public Dni() {
    }

    public Dni(char serie, int num) {
        this.serie = serie;
        this.num = num;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "{" + "serie=" + serie + ", num=" + num + '}';
    }
    
    
}
