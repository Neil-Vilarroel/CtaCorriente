package com.platinum.repository;

import com.platinum.entitie.Persona;

public interface PersonaRepository {
    Persona save(Persona persona);
    Persona findById(String rut);
    void delete(Persona persona);
    // Otros métodos para operaciones CRUD
}