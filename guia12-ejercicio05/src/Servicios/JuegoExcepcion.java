/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Servicios;

/**
 *
 * @author SimonValera
 */
public class JuegoExcepcion extends Exception {

    /**
     * Creates a new instance of <code>JuegoExcepcion</code> without detail
     * message.
     */
    public JuegoExcepcion() {
    }

    /**
     * Constructs an instance of <code>JuegoExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public JuegoExcepcion(String msg) {
        super(msg);
    }
}
