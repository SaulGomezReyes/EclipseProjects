package com.saul.gom.servicio.implementacion;

import com.saul.gom.dao.GeneroDao;
import com.saul.gom.dominio.Genero;
import com.saul.gom.servicio.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServImp implements GeneroService {

    @Autowired
    GeneroDao generoDao;

    @Override
    public void guardar(Genero genero) {
        generoDao.save(genero);
    }

    @Override
    public void editar(Genero genero) {
        generoDao.save(genero);
    }

    @Override
    public void eliminar(Genero genero) {
        generoDao.deleteById(genero.getIdGenero());
    }

    @Override
    public Genero buscar(Genero genero) {
        return generoDao.findById(genero.getIdGenero()).orElse(null);
    }

    @Override
    public List<Genero> listar() {
        return (List<Genero>) generoDao.findAll();
    }
}
