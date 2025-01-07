package com.ventas_2024.punto_venta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    // Reemplaza la relación con Empresa por una simple columna
    @Column(name = "idEmpresa", nullable = false)
    private Long idEmpresa;

    private String nombre;

    // Constructor vacío (requerido por JPA)
    public Categoria() {
    }

    // Constructor con parámetros
    public Categoria(Long idCategoria, Long idEmpresa, String nombre) {
        this.idCategoria = idCategoria;
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria [idCategoria=" + idCategoria +
               ", idEmpresa=" + idEmpresa +
               ", nombre=" + nombre + "]";
    }
}
