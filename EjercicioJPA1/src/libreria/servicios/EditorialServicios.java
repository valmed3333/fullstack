/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

/**
 *
 * @author SimonValera
 */
public class EditorialServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory tien = Persistence.createEntityManagerFactory("EjercicioJPA1PU");
    EntityManager em = tien.createEntityManager();
    
    public Editorial crearEditorial(){
        
        Editorial editorial = new Editorial();
        try {
            editorial.setAlta(Boolean.TRUE);
             System.out.println("Ingrese el nombre de la editorial");
            editorial.setNombre(leer.next());
            
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            
        } catch (Exception e) {
        }
        
        return editorial;
    }
    
    
    public void consultarEditoriales() {
        try {

            Collection<Editorial> editoriales = em.createQuery(
                    "SELECT a FROM Editorial a ORDER BY a.nombre asc ").getResultList();
            for (Editorial a : editoriales) {
                System.out.println(a);

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error 51 del sistema");

        }
    }
    
    public void consultarEditorial() {
        try {
            System.out.println("Ingrese el ID de la Editorial que desea consultar");
            Editorial autor5 = em.find(Editorial.class,
                    leer.nextInt());
            System.out.println(autor5);

        } catch (Exception e) {
            System.out.println("Error 51");
        }

    }
    
    public void modificarEditorial() throws Exception {
        try {
            Editorial e1 = new Editorial();
            consultarEditoriales();
            
            // Las siguientes lines sirven para hacer consultas a la base de datos
            // como like y order by
            /*Collection<Autor> autores = em.createQuery(
                    "SELECT a FROM Autor a WHERE a.nombre LIKE 'ar%' ").getResultList();
            Collection<Autor> autores = em.createQuery(
                    "SELECT a FROM Autor a ORDER BY a.nombre asc ").getResultList();
            
            for (Autor a : autores) {
                System.out.println(a);

            }*/
            System.out.println("Indique el ID del autor que desea modificar");
            int id = leer.nextInt();
            int max = (int) em.createQuery("select max(a.id) from Editorial a").getSingleResult();

            if (id > max) {
                throw new Exception("El valor ingresado es mayor que los id registrados");

            }
            Editorial editorial = em.find(Editorial.class, id);
            System.out.println("Indique el nuevo nombre del ID " + id);
            editorial.setNombre(leer.next());
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();

            consultarEditoriales();

        } catch (InputMismatchException e) {
            System.out.println("Error en el dato ingresado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;

        }
    }
}
   