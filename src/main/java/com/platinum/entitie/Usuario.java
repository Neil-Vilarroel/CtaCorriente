package com.platinum.entitie;

	import javax.persistence.Entity;
	import javax.persistence.Table;
	import javax.persistence.Id;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Column;

	@Entity
	@Table(name = "usuario")
	public class Usuario {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;
	    
	    @Column(name = "nombreUsuario")
	    private String nombreUsuario;
	    
	    @Column(name = "contrasena")
	    private String contrasena;
	    
	    // Getters y setters
	    public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getNombreUsuario() {
	        return nombreUsuario;
	    }
	    
	    public void setNombreUsuario(String nombreUsuario) {
	        this.nombreUsuario = nombreUsuario;
	    }
	    
	    public String getContrasena() {
	        return contrasena;
	    }
	    
	    public void setContrasena(String contrasena) {
	        this.contrasena = contrasena;
	    }
	

}
