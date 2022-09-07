package com.saul.gom.dao;

import com.saul.gom.dominio.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaDao extends CrudRepository<Pelicula, Integer> {
}
