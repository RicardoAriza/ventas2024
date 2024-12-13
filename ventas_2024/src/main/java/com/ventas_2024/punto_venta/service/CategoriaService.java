package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Categoria;
import com.ventas_2024.punto_venta.repository.ICategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService implements ICategoriaService {

    @Autowired
    private ICategoriaRepository repoCategoria;

    @Override
    public List<Categoria> getCategorias() {
        return repoCategoria.findAll();
    }

    @Override
    public void saveCategoria(Categoria categoria) {
        repoCategoria.save(categoria);
    }

    @Override
    public void deleteCategoria(Long id) {
        repoCategoria.deleteById(id);
    }

    @Override
    public Categoria findCategoria(Long id) {
        return repoCategoria.findById(id).orElse(null);
    }

    @Override
    public void editCategoria(Categoria categoria) {
        this.saveCategoria(categoria);
    }
}
