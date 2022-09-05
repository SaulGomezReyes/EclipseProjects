package com.example.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TORTAS")
public class Torta {

	@Id
	@Column(name = "ID_TORTA", columnDefinition = "NUMBER")
	int idTorta;

	@Column(name = "PRECIO", columnDefinition = "NUMBER")
	int precio;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	String nombre;

	@Column(name = "REGION", columnDefinition = "NVARCHAR2(100)")
	String region;

	public Torta() {
	}

	public Torta(int idTorta, int precio, String nombre, String region) {
		this.idTorta = idTorta;
		this.precio = precio;
		this.nombre = nombre;
		this.region = region;
	}

	public int getIdTorta() {
		return idTorta;
	}

	public void setIdTorta(int idTorta) {
		this.idTorta = idTorta;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Torta [idTorta=" + idTorta + ", precio=" + precio + ", nombre=" + nombre + ", region=" + region + "]";
	}

}
