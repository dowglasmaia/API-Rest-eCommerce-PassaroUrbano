package org.maiati.repository;

import org.maiati.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepo extends JpaRepository<Oferta, Long> {

}
