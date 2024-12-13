
package com.ventas_2024.punto_venta.dto;
import lombok.Data;

@Data
public class CategoriaDTO {
    private String idCategoria;
    private String idEmpresa; // Referencia de la empresa
    private String nombre;
}
