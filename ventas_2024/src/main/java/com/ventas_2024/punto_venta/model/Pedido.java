package com.ventas_2024.punto_venta.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonBackReference
    private Long idPedido;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
    private double total;
    private String fecha;

    public enum Estado {
        PENDIENTE, EN_PROCESO, COMPLETADO
    }

    public enum Tipo {
        NORMAL, URGENTE
    }

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @OneToOne
    @JoinColumn(name = "idPago")
    @JsonManagedReference
    private Pago pago;

    // Constructor vacío (requerido por JPA)
    public Pedido() {
    }

    // Constructor con parámetros
    public Pedido(Long idPedido, Usuario usuario, double total, Estado estado, Tipo tipo, List<DetallePedido> detalles, Pago pago) {
        this.idPedido = idPedido;
        this.usuario = usuario;
        this.total = total;
        this.estado = estado;
        this.tipo = tipo;
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "CEPedido [idPedido=" + idPedido
                + ", idUsuario=" + usuario
                + ", total=" + total
                + ", fecha=" + fecha
                + ", estado=" + estado
                + ", tipo=" + tipo
                + ", idPago=" + pago + "]";
    }
}
