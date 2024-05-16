package com.platinum.service;

import com.platinum.entitie.Persona;
import com.platinum.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroClienteService {

    private final PersonaRepository personaRepository;

    @Autowired
    public RegistroClienteService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public void registrarCliente(String nombre, String apellido, String direccion, String correo, String telefono, String nombreMascota) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setCorreo(correo);
        persona.setTelefono(telefono);
        persona.setNombreMascota(nombreMascota);

        personaRepository.save(persona);
    }
}
