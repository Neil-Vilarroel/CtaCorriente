package com.platinum.repository;

import com.platinum.entitie.Usuario;

public interface UsuarioRepository {
    Usuario save(Usuario usuario);
    Usuario findById(int id);
    void delete(Usuario usuario);
    // Otros m�todos para operaciones CRUD
}