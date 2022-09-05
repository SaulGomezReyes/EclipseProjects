package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dominio.Torta;
import com.example.servicio.TortaServ;

@RestController
@RequestMapping("TortaWs")
@CrossOrigin
public class TortaWs {
	
	@Autowired
	TortaServ tortaServicio;
	
	@GetMapping("listar")
	public List<Torta> listar(){
		var lista = tortaServicio.listar();
		System.out.println(lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Torta torta) {
		tortaServicio.guardar(torta);
	}
	
	@PostMapping("guardarl")
	public List<Torta> guardarl(@RequestBody Torta torta) {
		tortaServicio.guardar(torta);
		var lista = tortaServicio.listar();
		
		return lista;
	}
	
	@PostMapping("eliminar")
	public List<Torta> elimnar(@RequestBody Torta torta) {
		Torta tort = new Torta();
		tort = tortaServicio.buscar(torta);
		System.out.println(tort);
		tortaServicio.eliminar(torta);
		var lista = tortaServicio.listar();
		
		return lista;
	}
	
	@PostMapping("buscar")
	public Torta buscar(@RequestBody Torta torta) {
		Torta tort = new Torta();
		tort = tortaServicio.buscar(torta);
		System.out.println(tort);
		return tort;
	}
	
	@PostMapping("buscarNombre")
	public Torta buscarNombre(@RequestBody Torta torta) {
		Torta tort = new Torta();
		tort = tortaServicio.buscarNombre(torta);
		System.out.println(tort);
		return tort;
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Torta torta) {
		tortaServicio.editar(torta);
	}


}
