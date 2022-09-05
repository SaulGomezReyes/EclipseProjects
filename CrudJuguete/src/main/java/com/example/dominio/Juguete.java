package com.example.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Juguetes")
public class Juguete {

	@Id
	@Column(name="ID_JUGUETE", columnDefinition= "NUMBER")
	int idJuguete;
	
	@Column(name="NOMBRE", columnDefinition= "NVARCHAR2(100)")
	String nombre;
	
	@Column(name="PRECIO", columnDefinition= "NUMBER")
	double precio;
	
	@Column(name="EDAD_INCIAL", columnDefinition= "NUMBER")
	int edadInit;
	
	@Column(name="EDAD_FIN", columnDefinition= "NUMBER")
	int edadFin;
	
	public Juguete() {
		
	}
	
	
	public Juguete(int idJuguete, String nombre, double precio, int edadInit, int edadFin) {
		this.idJuguete = idJuguete;
		this.nombre = nombre;
		this.precio = precio;
		this.edadInit = edadInit;
		this.edadFin = edadFin;
	}



	public int getIdJuguete() {
		return idJuguete;
	}
	public void setIdJuguete(int idJuguete) {
		this.idJuguete = idJuguete;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdadInit() {
		return edadInit;
	}
	public void setEdadInit(int edadInit) {
		this.edadInit = edadInit;
	}
	public int getEdadFin() {
		return edadFin;
	}
	public void setEdadFin(int edadFin) {
		this.edadFin = edadFin;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Juguete [idJuguete=" + idJuguete + ", nombre=" + nombre + ", precio=" + precio + ", edadInit="
				+ edadInit + ", edadFin=" + edadFin + "]";
	}
	
	
	
	

}
