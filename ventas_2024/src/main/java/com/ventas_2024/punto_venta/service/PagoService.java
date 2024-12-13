package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Pago;
import com.ventas_2024.punto_venta.repository.IPagoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService implements IPagoService {

    @Autowired
    private IPagoRepository repoPago;

    @Override
    public List<Pago> getPagos() {
        return repoPago.findAll();
    }

    @Override
    public void savePago(Pago pago) {
        repoPago.save(pago);
    }

    @Override
    public void deletePago(Long id) {
        repoPago.deleteById(id);
    }

    @Override
    public Pago findPago(Long id) {
        return repoPago.findById(id).orElse(null);
    }

    @Override
    public void editPago(Pago pago) {
        this.savePago(pago);
    }
}
