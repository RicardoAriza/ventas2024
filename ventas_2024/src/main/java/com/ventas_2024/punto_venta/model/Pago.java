package com.ventas_2024.punto_venta.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago;
    @OneToOne
    @JoinColumn(name = "idPedido", nullable = false)
    @JsonBackReference
    private Pedido pedido;
    private double monto;

    public enum MetodoPago {
        TARJETA, EFECTIVO, TRANSFERENCIA
    }
    @Enumerated(EnumType.STRING)
    private MetodoPago metodo;
    private String fecha;
    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresa empresa;

    // Constructor vacío (requerido por JPA)
    public Pago() {
    }

    // Constructor con parámetros
    public Pago(Long idPago, Pedido pedido, double monto, MetodoPago metodo, String fecha, Empresa empresa) {
        this.idPago = idPago;
        this.pedido = pedido;
        this.monto = monto;
        this.metodo = metodo;
        this.fecha = fecha;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "CEPago [idPago=" + idPago
                + ", idPedido=" + pedido
                + ", monto=" + monto
                + ", metodo=" + metodo
                + ", fecha=" + fecha
                + ", idEmpresa=" + empresa + "]";
    }
}
