package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.DetallePedido;
import java.util.List;

public interface IDetallePedidoService {

    public List<DetallePedido> getDetallePedidos();

    public void saveDetallePedido(DetallePedido pedido);

    public void deleteDetallePedido(Long id);

    public DetallePedido findDetallePedido(Long id);

    public void editDetallePedido(DetallePedido pedido);
    
}