package com.saul.gom.controller;

import com.saul.gom.dominio.Pais;
import com.saul.gom.servicio.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("PaisWs")
public class PaisWs {

    @Autowired
    PaisService paisService;

    @GetMapping("listar")
    public List<Pais> listar(){
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
