package com.platinum.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.platinum.entitie.Transaccion;
import com.platinum.repository.TransaccionRepository;

@Repository
public class TransaccionRepositoryImpl implements TransaccionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Transaccion save(Transaccion transaccion) {
        entityManager.persist(transaccion);
        return transaccion;
    }

    @Override
    public Transaccion findById(int idTransaccion) {
        return entityManager.find(Transaccion.class, idTransaccion);
    }

    @Override
    public void delete(Transaccion transaccion) {
        entityManager.remove(entityManager.contains(transaccion) ? transaccion : entityManager.merge(transaccion));
    }

    // Otros métodos CRUD según sea necesario
}
