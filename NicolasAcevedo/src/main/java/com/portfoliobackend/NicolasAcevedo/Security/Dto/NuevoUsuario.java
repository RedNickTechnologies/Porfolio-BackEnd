package com.portfoliobackend.NicolasAcevedo.Security.Dto;

import java.util.HashSet;
import java.util.Set;


public class NuevoUsuario {
    
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();
    
}
