package com.platinum.controller;

import com.platinum.request.TransferenciaRequest;
import com.platinum.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferenciaController {

    private final TransferenciaService transferenciaService;

    @Autowired
    public TransferenciaController(TransferenciaService transferenciaService) {
        this.transferenciaService = transferenciaService;
    }

    @PostMapping("/transferencia")
    public void transferirFondos(@RequestBody TransferenciaRequest transferenciaRequest) {
        // Lógica de validación, por ejemplo:
        if (transferenciaRequest.getIdCuentaOrigen() == transferenciaRequest.getIdCuentaDestino()) {
            throw new IllegalArgumentException("La cuenta de origen y destino no pueden ser la misma.");
        }

        if (transferenciaRequest.getMonto() <= 0) {
            throw new IllegalArgumentException("El monto de la transferencia debe ser mayor que cero.");
        }

        // Llamada al servicio para realizar la transferencia de fondos
        transferenciaService.realizarTransferencia(transferenciaRequest.getIdCuentaOrigen(),
                                                   transferenciaRequest.getIdCuentaDestino(),
                                                   transferenciaRequest.getMonto());
    }
}
