package com.example.admin.model;

public class Cliente {

	private Integer idCliente;
	private String nombre;
	private double saldo;
	private String status;
	private String telefono;
	
	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String nombre, double saldo, String status, String telefono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.saldo = saldo;
		this.status = status;
		this.telefono = telefono;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", saldo=" + saldo + ", status=" + status
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}
