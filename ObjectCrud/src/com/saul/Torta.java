package com.saul;

public class Torta {

	private String nombre;
	private double precio;
	private String tamano;
	private String ingredientes;

	public Torta(String nombre, double precio, String tamano, String ingredientes) {
		this.nombre = nombre;
		this.precio = precio;
		this.tamano = tamano;
		this.ingredientes = ingredientes;
	}

	public Torta() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Torta [nombre=" + nombre + ", precio=" + precio + ", tamano=" + tamano + ", ingredientes="
				+ ingredientes + "]";
	}

}
