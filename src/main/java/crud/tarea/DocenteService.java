package  crud.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DocenteService {
    
    @Autowired 
    private DocenteRepository docenteRepository;
    
    //CRUD
    //Create
    public Docente save (Docente entity)
    {
       return docenteRepository.save(entity); //Guardar y retorna
    }
    
    //Read
    public Docente findById(long id, Object other)
    {
        return  docenteRepository.findById(id).orElse(null);
    }

    //Update no se crea ningun metodo se usa el metodo create
    //delete

    public void deleteById(long id)
    {
        docenteRepository.deleteById(id);
    }

    //Select all
    public List<Docente> findAll()
    {
        return docenteRepository.findAll();
    }
    
}

