package com.ventas_2024.punto_venta.dto;

import lombok.Data;

@Data
public class DetallePedidoDTO {
    private Long idDetallePedido;
    private Long idPedido; // Referencia al pedido
    private Long idProducto; // Referencia al producto
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    private double subTotal;
}


