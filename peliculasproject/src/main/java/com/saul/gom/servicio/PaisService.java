package com.saul.gom.servicio;

import com.saul.gom.dominio.Pais;

import java.util.List;

public interface PaisService {

    public void guardar(Pais pais);

    public void editar(Pais pais);

    public void eliminar(Pais pais);

    Pais buscar(Pais pais);

    public List<Pais> listar();

}
