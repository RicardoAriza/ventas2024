package com.ventas_2024.punto_venta.dto;
import lombok.Data;

@Data
public class UsuarioDTO {
    private String idUsuario;
    private String idEmpresa; // Referencia de la empresa
    private String nombre;
    private String correo;
    private String contrasena;
    private String tipoUsuario; // CLIENTE o ADMINISTRADOR
}
