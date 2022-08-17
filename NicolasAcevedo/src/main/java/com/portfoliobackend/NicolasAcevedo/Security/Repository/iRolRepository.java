
package com.portfoliobackend.NicolasAcevedo.Security.Repository;

import com.portfoliobackend.NicolasAcevedo.Security.Entity.Rol;
import com.portfoliobackend.NicolasAcevedo.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RedNickTechnologies
 */

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
    
}
