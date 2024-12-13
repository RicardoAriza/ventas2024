package com.ventas_2024.punto_venta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetallePedido;
    @ManyToOne
    @JoinColumn(name = "idPedido", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    private double subTotal;

    // Constructor vacío (requerido por JPA)
    public DetallePedido() {
    }

    // Constructor con parámetros
    public DetallePedido(Long idDetallePedido, Pedido pedido, Producto producto, String nombre, String descripcion, double precio, int cantidad, double subTotal) {
        this.idDetallePedido = idDetallePedido;
        this.pedido = pedido;
        this.producto = producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    // Método toString para mostrar los detalles del pedido
    @Override
    public String toString() {
        return "CEDetallePedido [idDetalle=" + idDetallePedido + 
               ", idPedido=" + pedido + 
               ", idProducto=" + producto + 
               ", nombre=" + nombre + 
               ", descripcion=" + descripcion + 
               ", precio=" + precio + 
               ", cantidad=" + cantidad + 
               ", subTotal=" + subTotal + "]";
    }
}
