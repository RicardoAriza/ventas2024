package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.DetallePedido;
import com.ventas_2024.punto_venta.repository.IDetallePedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoService implements IDetallePedidoService {

    @Autowired
    private IDetallePedidoRepository detaPedido;

    @Override
    public void saveDetallePedido(DetallePedido pedido) {
        detaPedido.save(pedido);
    }

    @Override
    public void deleteDetallePedido(Long id) {
        detaPedido.deleteById(id);
    }

    @Override
    public DetallePedido findDetallePedido(Long id) {
        return detaPedido.findById(id).orElse(null);
    }

    @Override
    public void editDetallePedido(DetallePedido pedido) {
        this.saveDetallePedido(pedido);
    }

    @Override
    public List<DetallePedido> getDetallePedidos() {
        return detaPedido.findAll();
    }

}
