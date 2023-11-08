package crud.tarea;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


//representa el repositorio es una interface
//la interfaz hereda de crudrepository y recibe como parametros la clase entidad y el tipo de dato de la clave primaria

public interface DocenteRepository extends  CrudRepository<Docente, Long> 
{

    List<Docente> findAll();
}