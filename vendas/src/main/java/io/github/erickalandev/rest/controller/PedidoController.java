package io.github.erickalandev.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.erickalandev.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	private PedidoService pedidoService;
	
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
}
