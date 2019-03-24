package org.maiati.controller;

import java.util.List;

import org.maiati.model.Oferta;
import org.maiati.service.OfertaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ofertas")
public class OfertaController {

	@Autowired
	private OfertaServices service;

	@GetMapping
	public List<Oferta> ofertas() {
		return service.findAll();
	}

	@GetMapping("/categorias")
	public ResponseEntity<List<Oferta>> findByCategoria(@RequestParam(value = "categoria") String categoria) {
		List<Oferta> list = service.findCategoria(categoria);

		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Oferta> buscarPorId(@PathVariable Long id) {
		Oferta obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
