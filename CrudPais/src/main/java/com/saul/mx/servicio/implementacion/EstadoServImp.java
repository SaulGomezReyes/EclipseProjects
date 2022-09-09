package com.saul.mx.servicio.implementacion;

import com.saul.mx.dao.EstadoDao;
import com.saul.mx.dominio.Estado;
import com.saul.mx.servicio.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServImp implements EstadoService {

    @Autowired
    EstadoDao estadoDao;

    @Override
    public void guardar(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    public void editar(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    public void eliminar(int estado) {
        estadoDao.deleteById(estado);
    }

    @Override
    public Estado buscar(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    public Estado buscarID(int estado) {
        return estadoDao.findById(estado).orElse(null);
    }

    @Override
    public List<Estado> listar() {
        return (List<Estado>) estadoDao.findAll();
    }
}
