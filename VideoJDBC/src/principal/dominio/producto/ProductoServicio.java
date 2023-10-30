/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.dominio.producto;

import java.util.Collection;
import principal.persistencia.ProductoDAO;

/**
 *
 * @author SimonValera
 */
public class ProductoServicio {
    
    private ProductoDAO dao;

    //Constructor Vacio
    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto(){
        
    }
    
    
    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
            
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {

        try {

            //Listamos los mascotas
            Collection<Producto> productos = listarProductos();

            //Imprimimos los mascotas
            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
