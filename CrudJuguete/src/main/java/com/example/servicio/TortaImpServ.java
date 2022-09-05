package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TortaDao;
import com.example.dominio.Torta;

@Service
public class TortaImpServ implements TortaServ {
	
	@Autowired
	TortaDao tortaServ;

	@Override
	public void guardar(Torta t) {
		// TODO Auto-generated method stub
		tortaServ.save(t);
	}

	@Override
	public void editar(Torta torta) {
		// TODO Auto-generated method stub
		tortaServ.save(torta);
	}

	@Override
	public void eliminar(Torta torta) {
		// TODO Auto-generated method stub
		tortaServ.deleteById(torta.getIdTorta());
	}

	@Override
	public Torta buscar(Torta torta) {
		// TODO Auto-generated method stub
		return tortaServ.findById(torta.getIdTorta()).orElse(null);
	}

	@Override
	public List<Torta> listar() {
		// TODO Auto-generated method stub
		return (List<Torta>) tortaServ.findAll();
	}

	@Override
	public Torta buscarNombre(Torta torta) {
		// TODO Auto-generated method stub
		
		return tortaServ.findByNombre(torta.getNombre());
	}

}
