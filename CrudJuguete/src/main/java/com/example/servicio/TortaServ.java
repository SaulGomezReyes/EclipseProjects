package com.example.servicio;

import java.util.List;

import com.example.dominio.Torta;



public interface TortaServ {
	
	public void guardar(Torta t);

	public void editar(Torta torta);

	public void eliminar(Torta torta);

	public Torta buscar(Torta torta);
	
	public Torta buscarNombre(Torta torta);

	public List<Torta> listar();

}
