package org.maiati.service;

import java.util.List;

import org.maiati.model.Pedido;
import org.maiati.repository.PedidoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoServices {

	@Autowired
	private PedidoRepo repo;

	/* salvar */
	@Transactional(rollbackFor = { Exception.class })
	public Pedido save(Pedido entity) {
		entity.setId(null);
		entity = repo.save(entity);
		return entity;
	}

	/* lista Pedidos */
	public List<Pedido> findAll() {
		return repo.findAll();
	}

	/* lista de Pedidos por categorias */
	public List<Pedido> findPedidosByPgto(String formaPagamento) {
		List<Pedido> list = repo.findByLastPagamento(formaPagamento);
		return list;
	}

	public List<Pedido> findByEndereco(String endereco) {
		List<Pedido> list = repo.pesquisarPedidos(endereco);
		return list;
	}

	/* lista de Pedidos por id */
	public Pedido findById(Long id) {
		return repo.findById(id).get();
	}

}
