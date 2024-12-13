package com.ventas_2024.punto_venta.dto;
import lombok.Data;

@Data
public class ProductoDTO {
    private String idProducto;
    private String idEmpresa; // Referencia de la empresa
    private String idCategoria; // Referencia de la categoría
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
}

