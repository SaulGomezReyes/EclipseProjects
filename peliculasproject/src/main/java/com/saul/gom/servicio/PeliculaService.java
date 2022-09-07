package com.saul.gom.servicio;

import com.saul.gom.dominio.Pelicula;

import java.util.List;

public interface PeliculaService {

    public void guardar(Pelicula pelicula);

    public void editar(Pelicula pelicula);

    public void eliminar(Pelicula pelicula);

    public Pelicula buscar(Pelicula pelicula);

    public List<Pelicula> listar();
}
