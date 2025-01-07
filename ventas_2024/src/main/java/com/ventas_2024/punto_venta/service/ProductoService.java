package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Producto;
import com.ventas_2024.punto_venta.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository repoProducto;

    @Override
    public List<Producto> getProductos() {
        return repoProducto.findAll();
    }
    
    @Override
    public void saveProducto(Producto producto) {
        repoProducto.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        repoProducto.deleteById(id);
    }

    @Override
    public Producto findProducto(Long id) {
        return repoProducto.findById(id).orElse(null);
    }

    @Override
    public void editProducto(Producto producto) {
        this.saveProducto(producto);
    }
    
    @Override
    public List<Producto> searchProducto(String nombre) {
        return repoProducto.findByNombreContainingIgnoreCase(nombre);
    }
}
