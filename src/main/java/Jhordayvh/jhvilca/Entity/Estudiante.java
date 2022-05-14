package Jhordayvh.jhvilca.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    private Integer codigo;
    private  Integer serie;
}
