package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.Categoria;
import com.ventas_2024.punto_venta.service.ICategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaServ;

    @GetMapping("/traer")
    public List<Categoria> getCategorias() {
        return categoriaServ.getCategorias();
    }

    @GetMapping("/{id}")
    public Categoria findCategoria(@PathVariable Long id) {
        return categoriaServ.findCategoria(id);
    }

    @PostMapping("/crear")
    public String saveCategoria(@RequestBody Categoria categoria) {
        categoriaServ.saveCategoria(categoria);
        return "La categoría fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteCategoria(@PathVariable Long id) {
        categoriaServ.deleteCategoria(id);
        return "La categoría fue eliminada correctamente";
    }

    @PutMapping("/editar")
    public Categoria editCategoria(@RequestBody Categoria categoria) {
        categoriaServ.editCategoria(categoria);
        return categoriaServ.findCategoria(categoria.getIdCategoria());
    }
}
