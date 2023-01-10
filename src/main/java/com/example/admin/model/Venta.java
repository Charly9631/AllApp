package com.example.admin.model;

import java.util.Arrays;
import java.util.Date;

public class Venta {

	private Integer idVenta;
	private String [] idProductos; 
	private double precio;
	private Date fecha;
	private String tipoPago;
	private String tipoVenta;
	
	public Venta() {
		super();
	}

	public Venta(Integer idVenta, String[] idProductos, double precio, Date fecha, String tipoPago,
			String tipoVenta) {
		super();
		this.idVenta = idVenta;
		this.idProductos = idProductos;
		this.precio = precio;
		this.fecha = fecha;
		this.tipoPago = tipoPago;
		this.tipoVenta = tipoVenta;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public String[] getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(String[] idProductos) {
		this.idProductos = idProductos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", idProductos=" + Arrays.toString(idProductos) + ", precio=" + precio
				+ ", fecha=" + fecha + ", tipoPago=" + tipoPago + ", tipoVenta=" + tipoVenta + "]";
	}

	
	
	
}
