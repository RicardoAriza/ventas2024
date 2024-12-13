package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Categoria;
import java.util.List;

public interface ICategoriaService {

    public List<Categoria> getCategorias();

    public void saveCategoria(Categoria categoria);

    public void deleteCategoria(Long id);

    public Categoria findCategoria(Long id);

    public void editCategoria(Categoria categoria);
}

