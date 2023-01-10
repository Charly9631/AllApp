package com.example.admin.model;

import java.util.Date;

public class Abonos {

	private Integer idAbono;
	private double cantidad;
	private Date fecha;
	private String nombreCliente;
	
	public Abonos() {
		super();
	}

	public Abonos(Integer idAbono, double cantidad, Date fecha, String nombreCliente) {
		super();
		this.idAbono = idAbono;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
	}

	public Integer getIdAbono() {
		return idAbono;
	}

	public void setIdAbono(Integer idAbono) {
		this.idAbono = idAbono;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Override
	public String toString() {
		return "Abonos [idAbono=" + idAbono + ", cantidad=" + cantidad + ", fecha=" + fecha + ", nombreCliente="
				+ nombreCliente + "]";
	}

	
}
