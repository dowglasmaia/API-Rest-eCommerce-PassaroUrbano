package org.maiati.repository;

import java.util.List;

import org.maiati.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepo extends JpaRepository<Pedido, Long> {
	
	/* Buscar ofertas por Categorias */
	 @Query("select u from Pedido u where u.formaPagamento = :formaPagamento")
	  List<Pedido>findByLastPagamento(@Param("formaPagamento") String formaPagamento);
	 
		 
	 @Query("select p from Pedido p where lower(p.endereco) like concat('%',lower(?1), '%')")
	  List<Pedido> pesquisarPedidos(String endereco);
	

}
