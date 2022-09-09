package com.saul.mx.servicio.implementacion;

import com.saul.mx.dao.PaisDao;
import com.saul.mx.dominio.Pais;
import com.saul.mx.servicio.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaisServImp implements PaisService {

    @Autowired
    PaisDao paisDao;

    @Override
    public void guardar(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    public void editar(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    public void eliminar(Pais pais) {
        paisDao.deleteById(pais.getIdPais());
    }

    @Override
    public int eliminarNombre(Pais pais) {
        return paisDao.deleteByNombre(pais.getNombre());
    }

    @Override
    public Pais buscar(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Override
    public List<Pais> listar() {
        return (List<Pais>) paisDao.findAll();
    }
}
