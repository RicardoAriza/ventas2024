package com.ventas_2024.punto_venta.repository;

import com.ventas_2024.punto_venta.model.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Long>{
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
