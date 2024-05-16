package com.platinum.repository;

import com.platinum.entitie.Transaccion;

public interface TransaccionRepository {
    Transaccion save(Transaccion transaccion);
    Transaccion findById(int idTransaccion);
    void delete(Transaccion transaccion);
    // Otros m�todos para operaciones CRUD
}