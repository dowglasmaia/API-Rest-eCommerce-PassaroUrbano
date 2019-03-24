package org.maiati.service;

import java.util.List;

import org.maiati.model.Oferta;
import org.maiati.repository.OfertaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfertaServices {

	@Autowired
	private OfertaRepo repo;

	/*salvar */
	public Oferta save(Oferta entity) {
		return repo.save(entity);
	}

	/*lista Ofertas  */
	public List<Oferta> findAll() {
		return repo.findAll();
	}

	/*lista de Ofertas por categorias */
	public List<Oferta> findCategoria(String categoria) {
		List<Oferta> list = repo.findByLastname(categoria);
		return list;
	}
	
	/*lista de Ofertas por id */
	public Oferta findById(Long id) {		
		return repo.findById(id).get();
	}

}
