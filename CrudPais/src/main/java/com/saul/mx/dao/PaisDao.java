package com.saul.mx.dao;

import com.saul.mx.dominio.Pais;
import org.springframework.data.repository.CrudRepository;

public interface PaisDao extends CrudRepository<Pais, Integer> {

    int deleteByNombre(String nombre);
}
