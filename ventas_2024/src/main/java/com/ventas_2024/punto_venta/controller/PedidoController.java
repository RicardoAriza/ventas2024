package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.Pedido;
import com.ventas_2024.punto_venta.service.IPedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private IPedidoService pedidoServ;

    @GetMapping("/traer")
    public List<Pedido> getPedidos() {
        return pedidoServ.getPedidos();
    }

    @GetMapping("/{id}")
    public Pedido findPedido(@PathVariable Long id) {
        return pedidoServ.findPedido(id);
    }
    
    @PostMapping("/crear")
    public String savePedido(@RequestBody Pedido pedido) {
        if (pedido.getUsuario() == null || pedido.getTotal() <= 0) {
        return "Los datos del pedido son incorrectos";
    }
    pedidoServ.savePedido(pedido);
    return "El pedido fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deletePedido(@PathVariable Long id) {
        pedidoServ.deletePedido(id);
        return "El pedido fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public Pedido editPedido(@RequestBody Pedido pedido) {
        pedidoServ.editPedido(pedido);
        return pedidoServ.findPedido(pedido.getIdPedido());
    }
    
    
}
