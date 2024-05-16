package com.platinum.entitie;

import com.platinum.entitie.CtaCorriente;
import com.platinum.entitie.Persona;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "transaccion")
public class Transaccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTransaccion")
    private int idTransaccion;
    
    @Column(name = "rutCliente")
    private String rutCliente;
    
    @Column(name = "rutDueno")
    private String rutDueno;
    
    @Column(name = "idCuenta")
    private int idCuenta;
    
    @Column(name = "montoTransferencia")
    private double montoTransferencia;
    
    @Column(name = "cuentaTransferencia")
    private String cuentaTransferencia;
    
    @Column(name = "tipoCuenta")
    private String tipoCuenta;
    
    @ManyToOne
    @JoinColumn(name = "rutCliente", referencedColumnName = "rut", insertable = false, updatable = false)
    private Persona personaCliente;
    
    @ManyToOne
    @JoinColumn(name = "rutDueno", referencedColumnName = "rut", insertable = false, updatable = false)
    private Persona personaDueno;
    
    @ManyToOne
    @JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta", insertable = false, updatable = false)
    private CtaCorriente cuentaCorriente;
    
    // Getters y setters
}
