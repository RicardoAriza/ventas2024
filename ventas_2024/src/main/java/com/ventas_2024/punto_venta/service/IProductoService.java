package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Producto;
import java.util.List;

public interface IProductoService {

    public List<Producto> getProductos();

    public void saveProducto(Producto producto);

    public void deleteProducto(Long id);

    public Producto findProducto(Long id);

    public void editProducto(Producto producto);
}
