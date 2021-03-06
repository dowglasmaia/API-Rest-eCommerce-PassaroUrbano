package org.maiati.controller;

import java.net.URI;
import java.util.List;

import org.maiati.model.Oferta;
import org.maiati.service.OfertaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("ofertas")
public class OfertaController {

	@Autowired
	private OfertaServices service;

	@PostMapping
	private ResponseEntity<Oferta> save(Oferta obj) {
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@GetMapping
	public List<Oferta> ofertas() {
		return service.findAll();
	}

	@GetMapping("/categorias")
	public ResponseEntity<List<Oferta>> findByCategoria(@RequestParam(value = "categoria") String categoria) {
		List<Oferta> list = service.findCategoria(categoria);

		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/descricao")
	public ResponseEntity<List<Oferta>> findByDescricao(@RequestParam(value = "descricao") String descraio) {
		List<Oferta> list = service.findDescricao(descraio);

		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Oferta> buscarPorId(@PathVariable Long id) {
		Oferta obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
