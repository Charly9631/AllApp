package com.example.admin.model;

public class Producto {

	private Integer idProducto;
	private String codigo;
	private String nombre;
	private double precio;
	private String propiedades;
	private Integer stock;
	
	public Producto() {
		super();
	}

	public Producto(Integer idProducto, String codigo, String nombre, double precio, String propiedades,
			Integer stock) {
		super();
		this.idProducto = idProducto;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.propiedades = propiedades;
		this.stock = stock;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(String propiedades) {
		this.propiedades = propiedades;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio
				+ ", propiedades=" + propiedades + ", stock=" + stock + "]";
	}
	
	
	
}
