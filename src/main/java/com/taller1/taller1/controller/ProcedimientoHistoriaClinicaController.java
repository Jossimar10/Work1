package com.taller1.taller1.controller;

import java.util.List;


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
@RequestMapping("/historiaclinica")
    public class ProcedimientoHistoriaClinicaController {

    @Autowired
    private final ProcedimientoHistoriaClinicaService procedimientoHistoriaClinicaService;
    
    @Autowired
    public ProcedimientoHistoriaClinicaController(ProcedimientoHistoriaClinicaService procedimientoHistoriaClinicaService) {
        this.procedimientoHistoriaClinicaService = procedimientoHistoriaClinicaService;
    }

    @GetMapping("/{id}")
    public ProcedimientoHistoriaClinicaDTO getById (@PathVariable Long idProcedimiento) {
        return procedimientoHistoriaClinicaService.findById(idProcedimiento);
    }

    @PostMapping
    public ProcedimientoHistoriaClinicaDTO createProcedimientoHistoriaClinica(@RequestBody ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        return procedimientoHistoriaClinicaService.save(procedimientoHistoriaClinicaDTO);
    }

    @PutMapping("/historiaclinica")
    public ProcedimientoHistoriaClinicaDTO updateProcedimientoHistoriaClinica(@org.springframework.web.bind.annotation.PathVariable Integer id, @RequestBody ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        return procedimientoHistoriaClinicaService.update(id, procedimientoHistoriaClinicaDTO);
    }

    @DeleteMapping("/historiaclinica")
    public void deleteProcedimientoHistoriaClinica(@org.springframework.web.bind.annotation.PathVariable Long id) {
        procedimientoHistoriaClinicaService.delete(id);
    }

    @GetMapping("/historiaclinica/List")
    public List<ProcedimientoHistoriaClinicaDTO> getAllProcedimientoHistoriaClinica() {
        return procedimientoHistoriaClinicaService.getAll();
    }

}


    






    

