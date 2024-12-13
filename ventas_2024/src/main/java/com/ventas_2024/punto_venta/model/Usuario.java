package com.ventas_2024.punto_venta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {

    @Id
    private Long idUsuario;
    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresa empresa;
    private String nombre;
    private String correo;
    private String contrasena;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    public enum TipoUsuario {
        CLIENTE, ADMINISTRADOR
    }
    
    // Constructor vacío
    public Usuario() {}

    // Constructor con todos los campos
    public Usuario(Long idUsuario, Empresa empresa, String nombre, String correo, String contrasena, TipoUsuario tipoUsuario) {
        this.idUsuario = idUsuario;
        this.empresa = empresa;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "CEUsuario [idUsuario=" + idUsuario + 
               ", idEmpresa=" + empresa + 
               ", nombre=" + nombre + 
               ", correo=" + correo + 
               ", contraseña=" + contrasena + 
               ", tipoUsuario=" + tipoUsuario + "]";
    }
}
