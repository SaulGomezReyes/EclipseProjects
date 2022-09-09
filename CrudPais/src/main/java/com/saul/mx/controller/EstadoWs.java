package com.saul.mx.controller;

import com.saul.mx.dominio.Estado;
import com.saul.mx.servicio.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("EstadoWs")
public class EstadoWs {

    @Autowired
    EstadoService estadoService;

    @GetMapping("listar")
    public List<Estado> listar(){
        var lista = estadoService.listar();
        return lista;
    }

    @PostMapping("guardar")
    public List<Estado> guardar(@RequestBody Estado estado){
        estadoService.guardar(estado);
        var lista = estadoService.listar();
        return lista;
    }


    @DeleteMapping("eliminar")
    public List<Estado> elminar(@RequestBody int estado) {
        estadoService.eliminar(estado);
        var lista = estadoService.listar();
        return lista;
    }


    @PutMapping("editar")
    public List<Estado> editar(@RequestBody Estado estado){
        estadoService.editar(estado);
        var lista = estadoService.listar();
        return lista;
    }

    @PostMapping("buscar")
    public Estado buscar(@RequestBody Estado estado){

        return estadoService.buscar(estado);
    }


}
