package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.Producto;
import com.ventas_2024.punto_venta.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoServ;

    @GetMapping("/traer")
    public List<Producto> getProductos() {
        return productoServ.getProductos();
    }
    
    @GetMapping("/search/{name}")
    public List<Producto> searchProductos(@PathVariable String name) {
        return productoServ.searchProducto(name);  // Pasamos 'name' en lugar de 'producto'
    }
    
    @GetMapping("/{id}")
    public Producto findProducto(@PathVariable Long id) {
        return productoServ.findProducto(id);
    }
    
    @PostMapping("/crear")
    public String saveProducto(@RequestBody Producto producto) {
        productoServ.saveProducto(producto);
        return "El producto fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteProducto(@PathVariable Long id) {
        productoServ.deleteProducto(id);
        return "El producto fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public Producto editProducto(@RequestBody Producto producto) {
        productoServ.editProducto(producto);
        return productoServ.findProducto(producto.getIdProducto());
    }
}
