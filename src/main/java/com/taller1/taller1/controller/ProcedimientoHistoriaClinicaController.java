package com.taller1.taller1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller1.taller1.Dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.service.ProcedimientoHistoriaClinicaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/procedimientos-historias")
public class ProcedimientoHistoriaClinicaController {

    @Autowired
    private ProcedimientoHistoriaClinicaService service;

    @GetMapping
    public List<ProcedimientoHistoriaClinicaDTO> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ProcedimientoHistoriaClinicaDTO save(@RequestBody ProcedimientoHistoriaClinicaDTO dto) {
        return service.save(dto);
    }


}
    

    

