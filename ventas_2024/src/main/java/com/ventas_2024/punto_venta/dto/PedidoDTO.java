package com.ventas_2024.punto_venta.dto;

import lombok.Data;
import java.util.List;

@Data
public class PedidoDTO {
    private String idPedido;
    private String idUsuario; // Referencia al usuario
    private double total;
    private String estado;
    private String tipo;
    private List<DetallePedidoDTO> detalles; // Lista de detalles del pedido
    private String idPago; // Referencia al pago
}
