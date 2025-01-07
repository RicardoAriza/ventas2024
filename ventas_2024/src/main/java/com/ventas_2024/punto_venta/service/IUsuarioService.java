package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Usuario;
import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getUsuarios();

    public void saveUsuario(Usuario usuario);

    public void deleteUsuario(Long id);

    public Usuario findUsuario(Long id);
    
    public Usuario findByUsername(String nombre);

    public void editUsuario(Usuario usuario);
    
    public boolean login(Long idUsuario, String password);
}
