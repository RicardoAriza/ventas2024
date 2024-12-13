package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.Usuario;
import com.ventas_2024.punto_venta.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioServ;

    @GetMapping("/traer")
    public List<Usuario> getUsuarios() {
        return usuarioServ.getUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario findUsuario(@PathVariable Long id) {
        return usuarioServ.findUsuario(id);
    }

    @PostMapping("/crear")
    public String saveUsuario(@RequestBody Usuario usuario) {
        usuarioServ.saveUsuario(usuario);
        return "El usuario fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        usuarioServ.deleteUsuario(id);
        return "El usuario fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public Usuario editUsuario(@RequestBody Usuario Usuario) {
        usuarioServ.editUsuario(Usuario);
        return usuarioServ.findUsuario(Usuario.getIdUsuario());
    }

    @PostMapping("/login")
    public String login(@RequestParam Long id_usuario, @RequestParam String password) {
        boolean isAuthenticated = usuarioServ.login(id_usuario, password);
        if (isAuthenticated) {
            return "Login exitoso";
        } else {
            return "Credenciales incorrectas";
        }
    }
}
