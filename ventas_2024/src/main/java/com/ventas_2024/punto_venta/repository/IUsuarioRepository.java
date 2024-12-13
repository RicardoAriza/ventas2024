package com.ventas_2024.punto_venta.repository;

import com.ventas_2024.punto_venta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long>{

    public Usuario findByIdUsuario(Long idUsuario);
    
}
