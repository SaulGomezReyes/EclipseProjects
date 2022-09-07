package com.saul.gom.controller;

import com.saul.gom.dominio.Pelicula;
import com.saul.gom.servicio.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("PeliculaWs")
public class PeliculaWs {

    @Autowired
    PeliculaService peliculaService;

    @GetMapping("listar")
    public List<Pelicula> listar(){
        var list = peliculaService.listar();
        return list;
    }

    @PostMapping("guardar")
    public List<Pelicula> guardar(@RequestBody Pelicula pelicula){
        peliculaService.guardar(pelicula);
        var lista = peliculaService.listar();
        return lista;
    }


    @DeleteMapping("eliminar")
    public List<Pelicula> elminar(@RequestBody Pelicula pelicula) {
        peliculaService.eliminar(pelicula);
        var lista = peliculaService.listar();
        return lista;
    }


    @PutMapping("editar")
    public List<Pelicula> editar(@RequestBody Pelicula pelicula){
        peliculaService.editar(pelicula);
        var lista = peliculaService.listar();
        return lista;
    }

    @PostMapping("buscar")
    public Pelicula buscar(@RequestBody Pelicula pelicula){
        return peliculaService.buscar(pelicula);
    }
}
