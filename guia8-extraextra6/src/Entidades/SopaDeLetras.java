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
public class SopaDeLetras {

    /*private String[] vector = {"perro", "avion", "titan", "carro", "simon", "araña",
         "clase", "juego", "nuevo", "ficha", "otros", "crear",
        "sumar", "vacio", "datos", "fijos", "letra", "fecha", "poner",
        "donde"};*/
    
    private String[] vector = {"perroaviontitancarrosimonarañaclasejuegonuevo" + 
            "fichaotroscrearsumarvaciodatosfijosletrafechaponerdonde"};
    private char[][] matriz=new char[10][10];
    private String palabra;

    public SopaDeLetras() {
    }

    public SopaDeLetras(char[][] matriz, String palabra) {
        this.matriz = matriz;
        this.palabra = palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    
}

