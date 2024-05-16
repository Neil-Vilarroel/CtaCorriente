package com.platinum.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.platinum.entitie.Persona;
import com.platinum.repository.PersonaRepository;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Persona save(Persona persona) {
        entityManager.persist(persona);
        return persona;
    }

    @Override
    public Persona findById(String rut) {
        return entityManager.find(Persona.class, rut);
    }

    @Override
    public void delete(Persona persona) {
        entityManager.remove(entityManager.contains(persona) ? persona : entityManager.merge(persona));
    }

    // Otros métodos CRUD según sea necesario
}
