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
   
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    private double total;

    // Constructor vacío (requerido por JPA)
    public DetallePedido() {
    }

    // Constructor con parámetros
    public DetallePedido(Long idDetallePedido, Pedido pedido, String nombre, String descripcion, double precio, int cantidad, double subTotal) {
        this.idDetallePedido = idDetallePedido;
        this.pedido = pedido;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = subTotal;
    }

    // Método toString para mostrar los detalles del pedido
    @Override
    public String toString() {
        return "CEDetallePedido [idDetalle=" + idDetallePedido + 
               ", idPedido=" + pedido + 
               ", nombre=" + nombre + 
               ", descripcion=" + descripcion + 
               ", precio=" + precio + 
               ", cantidad=" + cantidad + 
               ", subTotal=" + total + "]";
    }
}
