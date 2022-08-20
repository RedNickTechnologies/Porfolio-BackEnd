
package com.portfoliobackend.NicolasAcevedo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author RedNickTechnologies
 */

/* CREANDO ENTIDAD PERSONA JUNTO CON SUS CORRESPONDIENTES SETTER Y GETTER*/

@Entity
public class Persona {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max=50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max=50, message = "No cumple con la longitud")
    private String apellido;
    
    @Size(min = 1, max=50, message = "No cumple con la longitud")
    private String img;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
}
