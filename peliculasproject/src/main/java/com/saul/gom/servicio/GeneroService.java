package com.saul.gom.servicio;

import com.saul.gom.dominio.Genero;

import java.util.List;

public interface GeneroService {

    public void guardar(Genero genero);

    public void editar(Genero genero);

    public void eliminar(Genero genero);

    public Genero buscar(Genero genero);

    public List<Genero> listar();
}
