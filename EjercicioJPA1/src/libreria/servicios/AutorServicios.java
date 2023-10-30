/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author SimonValera
 */
public class AutorServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory tien = Persistence.createEntityManagerFactory("EjercicioJPA1PU");
    EntityManager em = tien.createEntityManager();

    public Autor crearAutor() {
        Autor autor = new Autor();
        try {
            autor.setAlta(Boolean.TRUE);
            //System.out.println("Ingrese el ID del autor");
            //autor.setId(leer.nextInt());
            System.out.println("Ingrese el nombre del autor");
            autor.setNombre(leer.next());
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();

        } catch (Exception e) {
        }

        return autor;
    }

    public void modificarAutor() throws Exception {
        try {
            Autor a1 = new Autor();
            consultarAutores();
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
            int max = (int) em.createQuery("select max(a.id) from Autor a").getSingleResult();

            if (id > max) {
                throw new Exception("El valor ingresado es mayor que los id registrados");

            }
            Autor autor = em.find(Autor.class, id);
            System.out.println("Indique el nuevo nombre del ID " + id);
            autor.setNombre(leer.next());
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();

            consultarAutores();

        } catch (InputMismatchException e) {
            System.out.println("Error en el dato ingresado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;

        }
    }

    public void consultarAutor() {
        try {
            System.out.println("Ingrese el ID del autor que desea consultar");
            Autor autor5 = em.find(Autor.class,
                    leer.nextInt());
            System.out.println(autor5);

        } catch (Exception e) {
            System.out.println("Error 51");
        }

    }

    public void consultarAutores() {
        try {

            Collection<Autor> autores = em.createQuery(
                    "select f from Autor f").getResultList();
            for (Autor a : autores) {
                System.out.println(a);

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error 51 del sistema");

        }
    }
}
