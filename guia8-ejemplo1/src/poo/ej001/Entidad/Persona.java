/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej001.Entidad;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SimonValera
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String ID;
    private int energia;

    public Persona(String nombre, String apellido, String ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        energia=1000;
    }

    
    
    public Persona(String nombre) {
        this.nombre = nombre;
        energia = 1000;
        //estudiar(energia,3);
    }

    public Persona(String nombre, String apellido, Date fechaDeNacimiento, String ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.ID = ID;
        energia = 1000;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * Funcion para restar energia por estudiar
     * @param restarEnergia
     * @return energia
     */
    public int estudiar(int restarEnergia) {
        for (int i = 0; i < restarEnergia; i++) {
            energia -= restarEnergia;

        }

        return energia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ID=" + ID + ", energia=" + energia + '}';
    }
}


