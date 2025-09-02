package com.taller1.taller1.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller1.taller1.dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.service.ProcedimientoHistoriaClinicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


//regular

@RestController
@RequestMapping("/historiaclinica")
    public class ProcedimientoHistoriaClinicaController {

    private final ProcedimientoHistoriaClinicaService procedimientoHistoriaClinicaService;
    
    public ProcedimientoHistoriaClinicaController(ProcedimientoHistoriaClinicaService procedimientoHistoriaClinicaService) {
        this.procedimientoHistoriaClinicaService = procedimientoHistoriaClinicaService;
    }


    @GetMapping("/crear/{id}")
    public ProcedimientoHistoriaClinicaDTO findById (@PathVariable Long id) {
        return procedimientoHistoriaClinicaService.findById(id);
    }

    @PostMapping
    public ProcedimientoHistoriaClinicaDTO createProcedimientoHistoriaClinica(@RequestBody ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        return procedimientoHistoriaClinicaService.save(procedimientoHistoriaClinicaDTO);
    }

    @PutMapping("/{id}")
    public ProcedimientoHistoriaClinicaDTO updateProcedimientoHistoriaClinica(@PathVariable Integer id, @RequestBody ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        return procedimientoHistoriaClinicaService.update(id, procedimientoHistoriaClinicaDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProcedimientoHistoriaClinica(@PathVariable Long id) {
        procedimientoHistoriaClinicaService.delete(id);
    }

    @GetMapping("/historiaclinica/List")
    public List<ProcedimientoHistoriaClinicaDTO> getAllProcedimientoHistoriaClinica() {
        return procedimientoHistoriaClinicaService.getAll();
    }

}


    






    

