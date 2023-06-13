/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.*;

/**
 *
 * @author SimonValera
 */
public class Mazo {

    private Scanner leer = new Scanner(System.in);
    ArrayList<Carta> baraja = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public void crearMazoNuevo() {
        String[] palo = {"espadas", "bastos", "oros", "copas"};
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String pal : palo) {
            for (int i : numero) {
                baraja.add(new Carta(i, pal));
            }
        }
        //System.out.println(baraja);
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void mostrarBaraja() {
        System.out.println("\nBaraja:");
        for (Carta bar : baraja) {
            System.out.println(bar.toString());
        }
    }

    public Carta siguienteCarta() {
        Carta c1 = new Carta();
        if (baraja.size() > 0) {
            c1 = baraja.get(0);
            baraja.remove(0);
            monton.add(c1);
        } else {
            System.out.println("Ya no hay más cartas en el mazo");
        }
        return c1;
    }

    public int cartasDisponibles() {
        //System.out.println("Quedan " + baraja.size() + " cartas en el mazo.");
        return baraja.size();
    }

    public void darCartas(Jugador j1) {
        //System.out.println("Ingrese el numero que cartas que desea entregarle a " + j1.getNombre());
        //int num = leer.nextInt();
        int num = 2;
        
        if(cartasDisponibles()>num){
            for (int i = 0; i < num; i++) {
                Carta c1 = new Carta();
                c1= siguienteCarta();
                
                j1.getMano().add(c1);
            }
        }else{
            System.out.println("No quedan suficientes cartas para repartir esa cantidad.");
        }
        
    }
    
    public void cartasMonton(){
        System.out.println("\nMonton:");
        for (Carta bar : monton) {
            System.out.println(bar.toString());
        }
    }

}
