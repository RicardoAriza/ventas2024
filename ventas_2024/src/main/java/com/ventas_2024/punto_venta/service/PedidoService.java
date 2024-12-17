package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Pedido;
import com.ventas_2024.punto_venta.repository.IPedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService implements IPedidoService {

    @Autowired
    private IPedidoRepository repoPedido;

    @Override
    public List<Pedido> getPedidos() {
        return repoPedido.findAll();
    }

    @Override
    public void savePedido(Pedido pedido) {
        repoPedido.save(pedido);
    }

    @Override
    public void deletePedido(Long id) {
        repoPedido.deleteById(id);
    }

    @Override
    public Pedido findPedido(Long id) {
        return repoPedido.findById(id).orElse(null);
    }

    @Override
    public void editPedido(Pedido pedido) {
        this.savePedido(pedido);
    }

}
