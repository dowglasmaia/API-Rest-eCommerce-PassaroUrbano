package org.maiati.controller;

import java.util.List;

import org.maiati.model.Oferta;
import org.maiati.service.OfertaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
