package com.saul.gom.controller;

import com.saul.gom.dominio.Genero;
import com.saul.gom.servicio.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("GeneroWs")
public class GeneroWs {

    @Autowired
    GeneroService generoService;

    @GetMapping("listar")
    public List<Genero> listar(){
        var list = generoService.listar();
        return list;
    }

    @PostMapping("guardar")
    public List<Genero> guardar(@RequestBody Genero genero){
        generoService.guardar(genero);
        var lista = generoService.listar();
        return lista;
    }


    @DeleteMapping("eliminar")
    public List<Genero> elminar(@RequestBody Genero genero) {
        generoService.eliminar(genero);
        var lista = generoService.listar();
        return lista;
    }


    @PutMapping("editar")
    public List<Genero> editar(@RequestBody Genero genero){
        generoService.editar(genero);
        var lista = generoService.listar();
        return lista;
    }

    @PostMapping("buscar")
    public Genero buscar(@RequestBody Genero genero){
        return generoService.buscar(genero);
    }

}
