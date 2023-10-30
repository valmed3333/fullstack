/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import principal.dominio.producto.ProductoServicio;
import principal.persistencia.*;

/**
 *
 * @author SimonValera
 */
public class VideoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ProductoServicio ps = new ProductoServicio();
        
        ps.imprimirProductos();
        
    }
    
}
