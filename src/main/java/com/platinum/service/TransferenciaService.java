package com.platinum.service;

import com.platinum.entitie.CtaCorriente;
import com.platinum.repository.CtaCorrienteRepository;

public class TransferenciaService {

    private CtaCorrienteRepository ctaCorrienteRepository;

    public TransferenciaService(CtaCorrienteRepository ctaCorrienteRepository) {
        this.ctaCorrienteRepository = ctaCorrienteRepository;
    }

    public void realizarTransferencia(int idCuentaOrigen, int idCuentaDestino, double monto) {
        CtaCorriente cuentaOrigen = ctaCorrienteRepository.findById(idCuentaOrigen);
        CtaCorriente cuentaDestino = ctaCorrienteRepository.findById(idCuentaDestino);

        if (cuentaOrigen != null && cuentaDestino != null) {
            if (cuentaOrigen.getSaldo() >= monto) {
                cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
                cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);

                ctaCorrienteRepository.save(cuentaOrigen);
                ctaCorrienteRepository.save(cuentaDestino);
            } else {
                throw new RuntimeException("La cuenta de origen no tiene suficientes fondos para realizar la transferencia.");
            }
        } else {
            throw new RuntimeException("Una de las cuentas no existe.");
        }
    }
}
