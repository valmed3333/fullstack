
package com.valmed.biblioteca.controladores;

import com.valmed.biblioteca.entidades.Autor;
import com.valmed.biblioteca.entidades.Editorial;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.valmed.biblioteca.excepciones.MiException;
import com.valmed.biblioteca.servicios.EditorialServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sim0ndev
 */

@Controller
@RequestMapping("/editorial") //localhost:8080/editorial
public class EditorialControlador {
@Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar") //localhost:8080/editorial/registrar
    public String registrar(){
        return "editorial_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {
            //System.out.println("Nombre: " + nombre);

            editorialServicio.crearEditorial(nombre);
            modelo.put("exito", "El editorial fue cargado correctamente");
        } catch (MiException ex) {
            
            modelo.put("error", ex.getMessage());
            //Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
        return "autor_form.html";
        }
        return "index.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.addAttribute("editoriales", editoriales);
        return "editorial_list.html";

    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("editorial", editorialServicio.getOne(id));
        return "editorial_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id,String nombre, ModelMap modelo) {
        try {
            editorialServicio.modificarEditorial(id, nombre);
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "editorial_modificar.html";
        }
    }
}
