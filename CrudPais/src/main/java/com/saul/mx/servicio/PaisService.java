package com.saul.mx.servicio;

import com.saul.mx.dominio.Pais;

import java.util.List;

public interface PaisService {
    public void guardar(Pais pais);

    public void editar(Pais pais);

    public void eliminar(Pais pais);

    public int eliminarNombre(Pais pais);

    Pais buscar(Pais pais);

    public List<Pais> listar();

}
