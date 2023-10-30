
package libreria;

import libreria.servicios.AutorServicios;
import libreria.servicios.EditorialServicios;
import libreria.servicios.LibroServicios;

/**
 *
 * @author SimonValera
 */
public class EjercicioJPA1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        
       // AutorServicios as = new lolitacuen
       //AutorServicios();
       // as.consultarAutor();
        
       // EditorialServicios es = new EditorialServicios();
       // es.crearEditorial();
       // es.modificarEditorial();
       
        LibroServicios ls = new LibroServicios();
        ls.modficarLibro();
        
        
    }
    
}
