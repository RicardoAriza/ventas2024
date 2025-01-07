package com.ventas_2024.punto_venta.model;

import jakarta.persistence.Column;
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
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    
    // Mapeo directo del campo de clave foránea
    @Column(name = "idEmpresa", nullable = false)
    private int idEmpresa;
   
    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private Categoria categoria;
    private String nombre;
    private String descripcion;
    private String precio;
    private String stock;

    // Constructor vacío (requerido por JPA)
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(Long idProducto, int idEmpresa, Categoria categoria, String nombre, String descripcion, String precio, String stock) {
        this.idProducto = idProducto;
        this.idEmpresa = idEmpresa;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "CEProducto [idProducto=" + idProducto + 
               ", idEmpresa=" + idEmpresa + 
               ", categoria=" + categoria + 
               ", nombre=" + nombre + 
               ", descripcion=" + descripcion + 
               ", precio=" + precio + 
               ", stock=" + stock + "]";
    }
}
