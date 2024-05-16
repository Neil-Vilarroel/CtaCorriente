package com.platinum.controller;

import com.platinum.service.RegistroClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroClienteController {

    private final RegistroClienteService registroClienteService;

    @Autowired
    public RegistroClienteController(RegistroClienteService registroClienteService) {
        this.registroClienteService = registroClienteService;
    }

    @PostMapping("/registro")
    public String registrarCliente(@RequestParam("nombre") String nombre,
                                   @RequestParam("apellido") String apellido,
                                   @RequestParam("direccion") String direccion,
                                   @RequestParam("correo") String correo,
                                   @RequestParam("telefono") String telefono,
                                   @RequestParam("nombreMascota") String nombreMascota) {
        registroClienteService.registrarCliente(nombre, apellido, direccion, correo, telefono, nombreMascota);
        return "redirect:/confirmacion";
    }
}
