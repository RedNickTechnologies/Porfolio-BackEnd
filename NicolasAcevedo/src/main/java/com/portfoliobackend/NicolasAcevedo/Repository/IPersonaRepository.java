package com.portfoliobackend.NicolasAcevedo.Repository;

import com.portfoliobackend.NicolasAcevedo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RedNickTechnologies
 */
@Repository

/* Se crea la interfaz persona para poder usar los metodos de JpaRepository*/

public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
