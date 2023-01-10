package com.example.admin.model;

import java.util.Arrays;

public class Contado {

	private Integer idContado;
	private String [] idProducto;
	private double ganancia;
	
	
	
	public Contado() {
		super();
	}

	public Contado(Integer idContado, String[] idProducto, double ganancia) {
		super();
		this.idContado = idContado;
		this.idProducto = idProducto;
		this.ganancia = ganancia;
	}

	public Integer getIdContado() {
		return idContado;
	}

	public void setIdContado(Integer idContado) {
		this.idContado = idContado;
	}

	public String[] getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String[] idProducto) {
		this.idProducto = idProducto;
	}

	public double getGanancia() {
		return ganancia;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}

	@Override
	public String toString() {
		return "Contado [idContado=" + idContado + ", idProducto=" + Arrays.toString(idProducto) + ", ganancia="
				+ ganancia + "]";
	}
	
	
	
}
