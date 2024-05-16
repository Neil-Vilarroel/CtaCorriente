package com.platinum.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.platinum.entitie.Usuario;
import com.platinum.repository.UsuarioRepository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Usuario save(Usuario usuario) {
        entityManager.persist(usuario);
        return usuario;
    }

    @Override
    public Usuario findById(int id) {
        return entityManager.find(Usuario.class, id);
    }

    @Override
    public void delete(Usuario usuario) {
        entityManager.remove(entityManager.contains(usuario) ? usuario : entityManager.merge(usuario));
    }

    // Otros métodos CRUD según sea necesario
}
