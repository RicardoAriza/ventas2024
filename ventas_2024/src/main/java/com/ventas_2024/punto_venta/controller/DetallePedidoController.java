package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.DetallePedido;
import com.ventas_2024.punto_venta.service.IDetallePedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalle-pedido")
public class DetallePedidoController {

    @Autowired
    private IDetallePedidoService pedidoServ;

    @GetMapping("/traer")
    public List<DetallePedido> getDetallePedidos() {
        return pedidoServ.getDetallePedidos();
    }

    @GetMapping("/{id}")
    public DetallePedido findDetallePedido(@PathVariable Long id) {
        return pedidoServ.findDetallePedido(id);
    }
    
    @PostMapping("/crear")
    public String saveDetallePedido(@RequestBody DetallePedido pedido) {
        pedidoServ.saveDetallePedido(pedido);
        return "El detalle del pedido fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteDetallePedido(@PathVariable Long id) {
        pedidoServ.deleteDetallePedido(id);
        return "El detalle del pedido fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public DetallePedido editDetallePedido(@RequestBody DetallePedido pedido) {
        pedidoServ.editDetallePedido(pedido);
        return pedidoServ.findDetallePedido(pedido.getIdDetallePedido());
    }
    
    
}
