package com.ventas_2024.punto_venta.service;

import com.ventas_2024.punto_venta.model.Empresa;
import com.ventas_2024.punto_venta.repository.IEmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    private IEmpresaRepository repoEmpresa;

    @Override
    public List<Empresa> getEmpresas() {
        return repoEmpresa.findAll();
    }

    @Override
    public void saveEmpresa(Empresa Empresa) {
        repoEmpresa.save(Empresa);
    }

    @Override
    public void deleteEmpresa(Long id) {
        repoEmpresa.deleteById(id);
    }

    @Override
    public Empresa findEmpresa(Long id) {
        return repoEmpresa.findById(id).orElse(null);
    }

    @Override
    public void editEmpresa(Empresa Empresa) {
        this.saveEmpresa(Empresa);
    }
}
