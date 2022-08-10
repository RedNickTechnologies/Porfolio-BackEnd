package com.portfoliobackend.NicolasAcevedo.Interface;

import com.portfoliobackend.NicolasAcevedo.Entity.Persona;
import java.util.List;

/**
 *
 * @author RedNickTechnologies
 */
public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    
    //Eliminar un objeto de tipo Persona
    public void deletePersona(Long id);
    
    
}
