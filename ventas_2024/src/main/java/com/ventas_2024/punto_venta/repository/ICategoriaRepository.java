package com.ventas_2024.punto_venta.repository;

import com.ventas_2024.punto_venta.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository <Categoria, Long>{
    
}
