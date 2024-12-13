package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Pedido;
import java.util.List;

public interface IPedidoService {

    public List<Pedido> getPedidos();

    public void savePedido(Pedido pedido);

    public void deletePedido(Long id);

    public Pedido findPedido(Long id);

    public void editPedido(Pedido pedido);
    
}
