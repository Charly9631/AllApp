package com.example.admin.model;

import java.util.Arrays;
import java.util.Date;

public class Credito {

	private Integer idCredito;
	private String [] idProducto;
	private Integer idCliente;
	private double saldoTotal;
	private Date fecha;
	
	public Credito() {
		super();
	}

	public Credito(Integer idCredito, String[] idProducto, Integer idCliente, double saldoTotal, Date fecha) {
		super();
		this.idCredito = idCredito;
		this.idProducto = idProducto;
		this.idCliente = idCliente;
		this.saldoTotal = saldoTotal;
		this.fecha = fecha;
	}

	public Integer getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(Integer idCredito) {
		this.idCredito = idCredito;
	}

	public String[] getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String[] idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Credito [idCredito=" + idCredito + ", idProducto=" + Arrays.toString(idProducto) + ", idCliente="
				+ idCliente + ", saldoTotal=" + saldoTotal + ", fecha=" + fecha + "]";
	}

		
	
}
