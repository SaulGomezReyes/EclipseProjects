package com.saul.gom.servicio.implementacion;

import com.saul.gom.dao.PeliculaDao;
import com.saul.gom.dominio.Pelicula;
import com.saul.gom.servicio.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServImp implements PeliculaService {

    @Autowired
    PeliculaDao peliculaDao;

    @Override
    public void guardar(Pelicula pelicula) {
        peliculaDao.save(pelicula);
    }

    @Override
    public void editar(Pelicula pelicula) {
        peliculaDao.save(pelicula);
    }

    @Override
    public void eliminar(Pelicula pelicula) {
        peliculaDao.deleteById(pelicula.getIdPelicula());
    }

    @Override
    public Pelicula buscar(Pelicula pelicula) {
        return peliculaDao.findById(pelicula.getIdPelicula()).orElse(null);
    }

    @Override
    public List<Pelicula> listar() {
        return (List<Pelicula>) peliculaDao.findAll();
    }
}
