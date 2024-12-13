package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.Pago;
import com.ventas_2024.punto_venta.service.IPagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private IPagoService pagoServ;

    @GetMapping("/traer")
    public List<Pago> getPagos() {
        return pagoServ.getPagos();
    }

    @GetMapping("/{id}")
    public Pago findPago(@PathVariable Long id) {
        return pagoServ.findPago(id);
    }

    @PostMapping("/crear")
    public String savePago(@RequestBody Pago pago) {
        if (pago.getMonto() <= 0 || pago.getMetodo() == null) {
        return "Los datos del pago son incorrectos";
    }
    pagoServ.savePago(pago);
    return "El pago fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deletePago(@PathVariable Long id) {
        pagoServ.deletePago(id);
        return "El pago fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public Pago editPago(@RequestBody Pago pago) {
        pagoServ.editPago(pago);
        return pagoServ.findPago(pago.getIdPago());
    }
}
