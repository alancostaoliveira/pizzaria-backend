package com.pizzaria.pizzaria_backend.controller;

import com.pizzaria.pizzaria_backend.model.Pedido;
import com.pizzaria.pizzaria_backend.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public Pedido realizarPedido(@RequestBody Pedido pedido) {
        return service.finalizarPedido(pedido);
    }
}