package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Pago;
import java.util.List;

public interface IPagoService {

    public List<Pago> getPagos();

    public void savePago(Pago pago);

    public void deletePago(Long id);

    public Pago findPago(Long id);

    public void editPago(Pago pago);
}
