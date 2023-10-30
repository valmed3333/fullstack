package principal.persistencia;

import principal.dominio.producto.*;
import java.sql.*;
import java.util.*;
import principal.dominio.fabricante.*;


/**
 *
 * @author SimonValera
 */
public final class ProductoDAO extends DAO{

    public void guardarProducto(Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("Debe especificar un producto");
            }
            
            String sql = "INSERT INTO PRODUCTO (codigo, nombre, precio, codigo_fabricante)" 
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() 
                    + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante()
                    + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM Producto WHERE codigo = " + codigo + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

        
}
