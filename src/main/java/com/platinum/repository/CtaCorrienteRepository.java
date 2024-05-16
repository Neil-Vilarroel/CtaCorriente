package com.platinum.repository;

import com.platinum.entitie.CtaCorriente;

public interface CtaCorrienteRepository {
    CtaCorriente save(CtaCorriente cuentaCorriente);
    CtaCorriente findById(int idCuenta);
    void delete(CtaCorriente cuentaCorriente);
    // Otros m�todos para operaciones CRUD
}