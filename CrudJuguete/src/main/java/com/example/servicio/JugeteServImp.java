package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.JugueteDao;
import com.example.dominio.Juguete;

@Service
public class JugeteServImp implements JugueteServ{

	@Autowired
	JugueteDao jugueteDao;
	
	@Override
	public void guardar(Juguete juguete) {
		// TODO Auto-generated method stub
		jugueteDao.save(juguete);
	}

	@Override
	public void editar(Juguete juguete) {
		// TODO Auto-generated method stub
		jugueteDao.save(juguete);
		
	}

	@Override
	public void eliminar(Juguete juguete) {
		// TODO Auto-generated method stub
		jugueteDao.deleteById(juguete.getIdJuguete());
	}

	@Override
	public Juguete buscar(Juguete juguete) {
		// TODO Auto-generated method stub
		return jugueteDao.findById(juguete.getIdJuguete()).orElse(null);
	}

	@Override
	public List<Juguete> listar() {
		// TODO Auto-generated method stub
		return (List<Juguete>) jugueteDao.findAll();
	}

}
