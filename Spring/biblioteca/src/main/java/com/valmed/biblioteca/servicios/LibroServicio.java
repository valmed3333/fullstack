package com.valmed.biblioteca.servicios;

import com.valmed.biblioteca.entidades.Autor;
import com.valmed.biblioteca.entidades.Editorial;
import com.valmed.biblioteca.entidades.Libro;
import com.valmed.biblioteca.excepciones.MiException;
import com.valmed.biblioteca.repositorios.AutorRepositorio;
import com.valmed.biblioteca.repositorios.EditorialRepositorio;
import com.valmed.biblioteca.repositorios.LibroRepositorio;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {

        validar(isbn, titulo, idAutor, idEditorial, ejemplares);

        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();

        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        libroRepositorio.save(libro);
    }

    public List<Libro> listarLibros() {

        List<Libro> libros = new ArrayList();

        libros = libroRepositorio.findAll();

        return libros;
    }

    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException {

        validar(isbn, titulo, idAutor, idEditorial, ejemplares);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }

        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }

        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);

            libroRepositorio.save(libro);
        }
    }
    
    public Libro getOne(Long isbn){
        return libroRepositorio.getOne(isbn);
    }
    
    private void validar(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{
        if (isbn == null) {
            throw new MiException("El isbn no puede ser nulo");
        }

        if (titulo.isEmpty() || titulo == null) {
            
            throw new MiException("El título no puede estar vacío o ser nulo");
        }
        if (ejemplares == null) {
            throw new MiException("Ejemplares no puede ser nulo");
        }

        if (idAutor.isEmpty() || idAutor == null) {
            
            throw new MiException("El id del autor no puede estar vacío o ser nulo");
        }
        
        if (idEditorial.isEmpty() || idEditorial == null) {
            
            throw new MiException("El id del editorial no puede estar vacío o ser nulo");
        }
    }
}
