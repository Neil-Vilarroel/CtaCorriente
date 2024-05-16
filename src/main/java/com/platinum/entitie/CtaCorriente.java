package com.platinum.entitie;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "ctaCorriente")
public class CtaCorriente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCuenta")
    private int idCuenta;
    
    @Column(name = "rutCliente")
    private String rutCliente;
    
    @Column(name = "monto")
    private double monto;

    // Agregar el atributo saldo y sus métodos getter y setter
    @Column(name = "saldo")
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Column(name = "idEjecutivo")
    private int idEjecutivo;
    
    @ManyToOne
    @JoinColumn(name = "rutCliente", referencedColumnName = "rut", insertable = false, updatable = false)
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "idEjecutivo", referencedColumnName = "id", insertable = false, updatable = false)
    private Usuario usuario;
    
    // Getters y setters
}
