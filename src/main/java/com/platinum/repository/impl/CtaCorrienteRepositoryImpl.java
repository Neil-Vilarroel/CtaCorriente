package com.platinum.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.platinum.entitie.CtaCorriente;
import com.platinum.repository.CtaCorrienteRepository;

@Repository
public class CtaCorrienteRepositoryImpl implements CtaCorrienteRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CtaCorriente save(CtaCorriente cuentaCorriente) {
        entityManager.persist(cuentaCorriente);
        return cuentaCorriente;
    }

    @Override
    public CtaCorriente findById(int idCuenta) {
        return entityManager.find(CtaCorriente.class, idCuenta);
    }

    @Override
    public void delete(CtaCorriente cuentaCorriente) {
        entityManager.remove(entityManager.contains(cuentaCorriente) ? cuentaCorriente : entityManager.merge(cuentaCorriente));
    }

    // Otros métodos CRUD según sea necesario
}
