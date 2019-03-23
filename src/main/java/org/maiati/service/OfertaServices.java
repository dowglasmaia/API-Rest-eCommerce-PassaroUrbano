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
	
	public Oferta save(Oferta entity) {
		return repo.save(entity);
	}
	
	public List<Oferta>findAll(){
		return repo.findAll();
	}

}
