package org.maiati.repository;

import java.util.List;

import org.maiati.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OfertaRepo extends JpaRepository<Oferta, Long> {
	
	/* Buscar ofertas por Categorias */
	 @Query("select u from Oferta u where u.categoria = :categoria")
	  List<Oferta>findByLastname(@Param("categoria") String categoria);
	 
	 /* Buscar ofertas por Categorias
	 @Transactional(readOnly = true)
	 List<Oferta> findByDescricaoOfertaStartingWith(String descricaoOferta);
	  */
	 
	 @Query("select o from Oferta o where lower(o.descricaoOferta) like concat('%',lower(?1), '%')")
	  List<Oferta> pesquisarOfertas(String descricao);
	

}
