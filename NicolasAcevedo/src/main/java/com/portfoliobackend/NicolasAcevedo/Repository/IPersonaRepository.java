package com.portfoliobackend.NicolasAcevedo.Repository;

import com.portfoliobackend.NicolasAcevedo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RedNickTechnologies
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
