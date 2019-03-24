package org.maiati.repository;

import java.util.List;

import org.maiati.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepo extends JpaRepository<Oferta, Long> {
	
	 @Query("select u from Oferta u where u.categoria = :categoria")
	  List<Oferta>findByLastname(@Param("categoria") String categoria);
	

}
