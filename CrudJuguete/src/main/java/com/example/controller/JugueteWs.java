package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dominio.Juguete;
import com.example.servicio.JugueteServ;

@RestController
@RequestMapping("JugueteWs")
@CrossOrigin
public class JugueteWs {

	@Autowired
	JugueteServ jugueteServicio;
	
	@GetMapping("listar")
	public List<Juguete> listar(){
		var lista = jugueteServicio.listar();
		System.out.println(lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Juguete juguete) {
		jugueteServicio.guardar(juguete);
	}
	
	@PostMapping("guardarl")
	public List<Juguete> guardarl(@RequestBody Juguete juguete) {
		jugueteServicio.guardar(juguete);
		var lista = jugueteServicio.listar();
		
		return lista;
	}
	
	@PostMapping("eliminar")
	public List<Juguete> elimnar(@RequestBody Juguete idJuguete) {
		Juguete jug = new Juguete();
		jug = jugueteServicio.buscar(idJuguete);
		System.err.println("Objeto: " +jug+ " eliminado!!!");
		jugueteServicio.eliminar(idJuguete);
		var lista = jugueteServicio.listar();
		
		return lista;
	}
	
	@PostMapping("buscar")
	public Juguete buscar(@RequestBody Juguete idJuguete) {
		Juguete jug = new Juguete();
		jug = jugueteServicio.buscar(idJuguete);
		System.out.println(jug);
		return jug;
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Juguete juguete) {
		jugueteServicio.editar(juguete);
	}
		
	}
	

