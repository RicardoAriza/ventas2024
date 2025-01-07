package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Usuario;
import com.ventas_2024.punto_venta.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repoUsuario;

    @Override
    public List<Usuario> getUsuarios() {
        return repoUsuario.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        repoUsuario.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        repoUsuario.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        return repoUsuario.findById(id).orElse(null);
    }
    
    @Override
    public Usuario findByUsername(String username) {
        Usuario usuario = repoUsuario.findByUsername(username);
        return usuario; // Retorna null si no encuentra el usuario (puedes lanzar una excepción si lo prefieres)
    }

    @Override
    public void editUsuario(Usuario usuario) {
        this.saveUsuario(usuario);
    }

    @Override
    public boolean login(Long idUsuario, String password) {
        Usuario usuario = repoUsuario.findByIdUsuario(idUsuario);
        if (usuario != null && usuario.getContrasena().equals(password)) {
            return true;
        }
        return false;
    }
}
