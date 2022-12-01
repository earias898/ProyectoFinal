
package ProyectoFinal.Grupo7.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

  @Entity
@Table(name = "producto")
public class Producto implements Serializable{
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    private String nombreproducto;
    private double precioproducto;
    @Column(name="ruta_imagen")
    private String rutaImagen;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
