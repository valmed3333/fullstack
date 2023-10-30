package com.valmed.biblioteca.servicios;

import com.valmed.biblioteca.entidades.Editorial;
import com.valmed.biblioteca.excepciones.MiException;
import com.valmed.biblioteca.repositorios.EditorialRepositorio;
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
public class EditorialServicio {

    @Autowired
    EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {
        validar(nombre);
        
        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);

        editorialRepositorio.save(editorial);

    }

    public List<Editorial> listarEditoriales() {

        List<Editorial> editoriales = new ArrayList();

        editoriales = editorialRepositorio.findAll();

        return editoriales;

    }

    public void modificarEditorial(String id, String nombre) throws MiException {

        if (id.isEmpty()|| id==null) {
            throw new MiException("El id no puede estar vacío ni ser nulo");
        }
        validar(nombre);
        
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);

            editorialRepositorio.save(editorial);

        }

    }
    
    public Editorial getOne(String id){
        return editorialRepositorio.getOne(id);
    }
    
    private void validar(String nombre) throws MiException{
        if (nombre.isEmpty()|| nombre==null) {
            throw new MiException("El nombre no puede estar vacío ni ser nulo");
        }
        
        
    }
}
