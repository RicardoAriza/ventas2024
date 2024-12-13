package com.ventas_2024.punto_venta.repository;

import com.ventas_2024.punto_venta.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository <Pedido, Long>{
    
}
