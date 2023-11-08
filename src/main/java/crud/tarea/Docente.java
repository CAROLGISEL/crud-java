package crud.tarea;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Docente {
    
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private String years;
    private String nationality;

}