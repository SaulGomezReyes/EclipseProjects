package com.example.servicio;

import java.util.List;

import com.example.dominio.Juguete;

public interface JugueteServ {

	public void guardar(Juguete juguete);
	public void editar(Juguete juguete);
	public void eliminar(Juguete juguete);
	public Juguete buscar(Juguete juguete);
	
	public List<Juguete> listar();
	
}
