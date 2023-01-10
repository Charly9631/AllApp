package com.example.admin.model;

public class Admin {
	private Integer idAdmin;
	private String nombre;
	private String usuario;
	private String password;
	private String telefono;
	
	
	
	public Admin() {
		super();
	}
	public Admin(Integer idAdmin, String nombre, String usuario, String password, String telefono) {
		super();
		this.idAdmin = idAdmin;
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
		this.telefono = telefono;
	}
	public Integer getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", nombre=" + nombre + ", usuario=" + usuario + ", password=" + password
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	

}
