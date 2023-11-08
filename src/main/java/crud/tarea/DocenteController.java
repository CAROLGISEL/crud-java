package crud.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("api/docente")
@CrossOrigin({"*"})

public class DocenteController {
    
    @Autowired
    private DocenteService docenteService;

    @PostMapping("/") //sub ruta para saber cuando guardar
    public Docente save(@RequestBody Docente entity) //para json @RequestBody
    {
        return docenteService.save(entity);
    }

    //para el metodo red
    @GetMapping("/{id}/")
    public Docente findById(@PathVariable long id)
    {
        return docenteService.findById(id, id);
    }

    //para el update
    @PutMapping("/")
    public Docente update(@RequestBody Docente entity)
    {
        return docenteService.save(entity);
    }

    //para el delete
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        docenteService.deleteById(id);
    }

}