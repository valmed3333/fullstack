
package com.valmed.biblioteca.servicios;

import com.valmed.biblioteca.entidades.Autor;
import com.valmed.biblioteca.excepciones.MiException;
import com.valmed.biblioteca.repositorios.AutorRepositorio;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sim0ndev
 */
@Service
public class AutorServicio {
    
    @Autowired
    AutorRepositorio autorRepositorio;
    
    @Transactional
    public void crearAutor(String nombre) throws MiException{
        
        validar(nombre);
        
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
        
    }
    
    public List<Autor> listarAutores(){
        List<Autor> autores = new ArrayList();
        autores=autorRepositorio.findAll();
        
        return autores;
        
    } 
    
    public void modificarAutor(String id, String nombre) throws MiException{
        
        if (id.isEmpty()|| id==null) {
            throw new MiException("El id no puede estar vacio ni ser nulo");
        }
        validar(nombre);
        
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Autor autor= respuesta.get();
            autor.setNombre(nombre);
            
            autorRepositorio.save(autor);
                    
        }
        
    }
    
    public Autor getOne(String id){
        return autorRepositorio.getOne(id);
    }
    
    private void validar(String nombre) throws MiException{
        if (nombre.isEmpty()|| nombre==null) {
            throw new MiException("El nombre no puede estar vacio ni ser nulo");
        }
        
        
    }
}
