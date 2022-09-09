package com.saul.mx.controller;

import com.saul.mx.dominio.Pais;
import com.saul.mx.servicio.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("PaisWs")
public class PaisWs {

    @Autowired
    PaisService paisService;

    @GetMapping("listar")
    public List<Pais>listar(){
        var list = paisService.listar();
        return list;
    }

    @PostMapping("guardar")
    public List<Pais> guardar(@RequestBody Pais pais){
        paisService.guardar(pais);
        var lista = paisService.listar();
        return lista;
    }


    @DeleteMapping("eliminar")
    public List<Pais> elminar(@RequestBody Pais pais) {
        paisService.eliminar(pais);
        var lista = paisService.listar();
        return lista;
    }

    @Transactional
    @DeleteMapping("eliminarN")
    public List<Pais> elminarN(@RequestBody Pais pais) {
        try {
        paisService.eliminarNombre(pais);
        var lista = paisService.listar();
        return lista;
        }
        catch (TransactionException exception){
            return (List<Pais>) exception;
        }
    }

    @PutMapping("editar")
    public List<Pais> editar(@RequestBody Pais pais){
        paisService.editar(pais);
        var lista = paisService.listar();
        return lista;
    }

    @PostMapping("buscar")
    public Pais buscar(@RequestBody Pais pais){

        return paisService.buscar(pais);
    }

}
