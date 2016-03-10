package Modelo;
// Generated 19-feb-2016 17:19:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer idcategoria;
     private String descripcion;
     private Set hotels = new HashSet(0);

    public Categoria() {
    }

    public Categoria(String descripcion, Set hotels) {
       this.descripcion = descripcion;
       this.hotels = hotels;
    }
   
    public Integer getIdcategoria() {
        return this.idcategoria;
    }
    
    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getHotels() {
        return this.hotels;
    }
    
    public void setHotels(Set hotels) {
        this.hotels = hotels;
    }




}

