package com.ventas_2024.punto_venta.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PagoDTO {
    private String idPago;
    private String idPedido; // Referencia al pedido
    private double monto;
    private String metodo;
    private Date fecha;
    private String idEmpresa; // Referencia a la empresa
}
