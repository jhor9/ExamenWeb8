package Jhordayvh.jhvilca.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dirteccion")
public class Direccion {

     private String calle;
     private String ciudad;
     private String estado;
     private Integer codigopostal;
     private String pais;
}


