package com.ventas_2024.punto_venta.controller;

import com.ventas_2024.punto_venta.model.Empresa;
import com.ventas_2024.punto_venta.service.IEmpresaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaServ;

    @GetMapping("/traer")
    public List<Empresa> getEmpresas() {
        return empresaServ.getEmpresas();
    }
    
    @GetMapping("/{id}")
    public Empresa findEmpresa(@PathVariable Long id) {
        return empresaServ.findEmpresa(id);
    }

    @PostMapping("/crear")
    public String saveEmpresa(@RequestBody Empresa empresa) {
        empresaServ.saveEmpresa(empresa);
        return "La empresa fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteEmpresa(@PathVariable Long id) {
        empresaServ.deleteEmpresa(id);
        return "La empresa fue eliminada correctamente";
    }

    @PutMapping("/editar")
    public Empresa editEmpresa(@RequestBody Empresa empresa) {
        empresaServ.editEmpresa(empresa);
        return empresaServ.findEmpresa(empresa.getIdEmpresa());
    }
}
