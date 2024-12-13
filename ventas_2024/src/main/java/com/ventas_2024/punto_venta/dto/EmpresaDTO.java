package com.ventas_2024.punto_venta.dto;
import lombok.Data;
import java.util.Date;

@Data
public class EmpresaDTO {
    private String idEmpresa;
    private String nombre;
    private String correoContacto;
    private String telefono;
    private String direccion;
    private Date fechaRegistro;
}
