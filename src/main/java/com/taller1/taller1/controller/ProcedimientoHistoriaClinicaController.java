package com.taller1.taller1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller1.taller1.dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.service.ProcedimientoHistoriaClinicaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/procedimientos-historias") 
    public class ProcedimientoHistoriaClinicaController {
        private final ProcedimientoHistoriaClinicaService procedimientoHistoriaClinicaService; 

    public ProcedimientoHistoriaClinicaController(ProcedimientoHistoriaClinicaService procedimientoHistoriaClinicaService) {
        this.procedimientoHistoriaClinicaService = procedimientoHistoriaClinicaService;
    }

    @GetMapping("/HistoriaClinica")
    public ProcedimientoHistoriaClinicaDTO getProcedimientoHistoriaClinicaById(@org.springframework.web.bind.annotation.PathVariable Long id) {
        return procedimientoHistoriaClinicaService.findById(id);
    }   

    @PostMapping("/HistoriaClinica2")
    public ProcedimientoHistoriaClinicaDTO createProcedimientoHistoriaClinica(@RequestBody ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        return procedimientoHistoriaClinicaService.save(procedimientoHistoriaClinicaDTO);
    }

    @PutMapping("/HistoriaClinica3")
    public ProcedimientoHistoriaClinicaDTO updateProcedimientoHistoriaClinica(@org.springframework.web.bind.annotation.PathVariable Integer id, @RequestBody ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        return procedimientoHistoriaClinicaService.update(id, procedimientoHistoriaClinicaDTO);
    }

    @DeleteMapping("/HistoriaClinica4")
    public void deleteProcedimientoHistoriaClinica(@org.springframework.web.bind.annotation.PathVariable Long id) {
        procedimientoHistoriaClinicaService.delete(id);
    }

}


    






    

