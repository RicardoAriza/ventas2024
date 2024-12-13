package com.ventas_2024.punto_venta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa; // Se utiliza Long en lugar de String para ID si es autogenerado

    private String nombre;
    private String correoContacto;
    private String telefono;
    private String direccion;
    private String fechaRegistro;

    // Constructor vacío
    public Empresa() {
    }

    // Constructor con parámetros
    public Empresa(Long idEmpresa, String nombre, String correoContacto, String telefono, String direccion, String fechaRegistro) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.correoContacto = correoContacto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }
}
