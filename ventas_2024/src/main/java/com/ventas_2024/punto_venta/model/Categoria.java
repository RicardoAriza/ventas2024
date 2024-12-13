package com.ventas_2024.punto_venta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria; // Si prefieres String, lo puedes mantener como String
    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresa empresa;
    private String nombre;

    // Constructor vacío (requerido por JPA)
    public Categoria() {
    }

    // Constructor con parámetros
    public Categoria(Long idCategoria, Empresa empresa, String nombre) {
        this.idCategoria = idCategoria;
        this.empresa = empresa;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CECategoria [idCategoria=" + idCategoria
                + ", idEmpresa=" + empresa
                + ", nombre=" + nombre + "]";
    }
}
