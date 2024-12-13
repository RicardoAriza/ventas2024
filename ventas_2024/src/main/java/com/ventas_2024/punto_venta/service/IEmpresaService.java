package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Empresa;
import java.util.List;

public interface IEmpresaService {

    public List<Empresa> getEmpresas();

    public void saveEmpresa(Empresa Empresa);

    public void deleteEmpresa(Long id);

    public Empresa findEmpresa(Long id);

    public void editEmpresa(Empresa Empresa);
}
