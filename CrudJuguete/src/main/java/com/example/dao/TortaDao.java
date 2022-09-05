package com.example.dao;



import org.springframework.data.repository.CrudRepository;

import com.example.dominio.Torta;

public interface TortaDao extends CrudRepository<Torta, Integer> {

	Torta findByNombre(String nombre);
	
}
