package com.saul.mx.servicio;

import com.saul.mx.dominio.Estado;

import java.util.List;

public interface EstadoService {

    public void guardar(Estado estado);

    public void editar(Estado estado);

    public void eliminar(int estado);

    public Estado buscar(Estado estado);
    public Estado buscarID(int estado);

    public List<Estado> listar();

}
