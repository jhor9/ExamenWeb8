package Jhordayvh.jhvilca.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

    private String nombre;
    private  Integer telefono;
    private String gmail;
}
