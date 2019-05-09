package org.maiati.controller;

import java.net.URI;
import java.util.List;

import org.maiati.model.Pedido;
import org.maiati.service.PedidoServices;
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
@RequestMapping("pedidos")
public class PeidoController {

	@Autowired
	private PedidoServices service;

	@PostMapping
	private ResponseEntity<Pedido> save(Pedido obj) {
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@GetMapping
	public List<Pedido> Pedidos() {
		return service.findAll();
	}

	@GetMapping("/pagamentos")
	public ResponseEntity<List<Pedido>> findByCategoria(@RequestParam(value = "pagamento") String formaPgamento) {
		List<Pedido> list = service.findPedidosByPgto(formaPgamento);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/endereco")
	public ResponseEntity<List<Pedido>> findByDescricao(@RequestParam(value = "endereco") String endereco) {
		List<Pedido> list = service.findByEndereco(endereco);

		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
