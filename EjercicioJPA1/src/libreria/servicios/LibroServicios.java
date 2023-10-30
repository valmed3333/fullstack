/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Libro;

/**
 *
 * @author SimonValera
 */
public class LibroServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory tien = Persistence.createEntityManagerFactory("EjercicioJPA1PU");
    EntityManager em = tien.createEntityManager();

    public Libro crearLibro() {
        Libro libro = new Libro();
        Autor autor = new Autor();
        AutorServicios as = new AutorServicios();
        Autor autor5 = new Autor();
        try {

            libro.setAlta(Boolean.TRUE);
            //System.out.println("Ingrese el ID del autor");
            //autor.setId(leer.nextInt());
            System.out.println("Ingrese el nombre del libro");
            libro.setTitulo(leer.next());
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.out.println("ingrese el Anio");
            libro.setAnio(leer.nextInt());
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.out.println("ingrese cantida de ejemplares ejemplares");
            libro.setEjemplares(leer.nextInt());
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.err.println("ingrese autor");
            String nombre = leer.next();
            autor5 = (Autor) em.createQuery("select a from Autor a where a.nombre like '%" + nombre + "%'").getSingleResult();
           // System.out.println(autor5.getNombre());
        } catch (NoResultException e) {

            System.out.println("el autor ingresado no existe");
            autor5 = as.crearAutor();

        } catch (Exception e) {

            throw e;
        } finally {
            libro.setAutor(autor5);
           em.getTransaction().begin();
            em.persist(libro);
           em.getTransaction().commit();
        }
        return libro;
    }
    
    public void modficarLibro(){
        
        Libro l1= new Libro();
        Autor autor5 = new Autor();
        AutorServicios as = new AutorServicios();
        try {
            
        
        
        System.out.println("ingrese el Titulo del libro a modificar ");
        String nombre = leer.next();
        
            l1 = (Libro) em.createQuery("select a from Libro a where a.titulo like '%" + nombre + "%'").getSingleResult();
            System.out.println(l1);
            System.out.println("ingrese el nuevo titulo");
           l1.setTitulo(leer.next());
           System.out.println("ingrese nuevo año");
           l1.setAnio(leer.nextInt());
           System.out.println("ingrese nueva cantidad de ejemplares");
           l1.setEjemplares(leer.nextInt());
           System.out.println("ingrese el nuevo autor ");
            String autor = leer.next();
            autor5 = (Autor) em.createQuery("select a from Autor a where a.nombre like '%" + autor + "%'").getSingleResult();
        } catch (NoResultException e) {
           System.out.println(autor5.getNombre());
            if (autor5.getNombre() == null) {
                System.out.println("el autor ingresado no existe");
            autor5 = as.crearAutor();
            }else{
                System.out.println("el libro ingresado no exite");
                modficarLibro();
            }
                
            

        } catch (Exception e) {

            throw e;
        } finally {
            l1.setAutor(autor5);
           em.getTransaction().begin();
            em.merge(l1);
           em.getTransaction().commit();
        }
                
        
        
    }
    
}
