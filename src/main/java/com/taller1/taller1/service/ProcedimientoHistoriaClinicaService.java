package com.taller1.taller1.service;

import java.util.List;

import com.taller1.taller1.Dto.ProcedimientoHistoriaClinicaDTO;

public interface ProcedimientoHistoriaClinicaService {

    List<ProcedimientoHistoriaClinicaDTO> getAll();
    ProcedimientoHistoriaClinicaDTO save(ProcedimientoHistoriaClinicaDTO dto);
}

