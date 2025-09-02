package com.taller1.taller1.service;

import java.util.List;

import com.taller1.taller1.dto.ProcedimientoHistoriaClinicaDTO;

//Falta explicacion
public interface ProcedimientoHistoriaClinicaService {
    public ProcedimientoHistoriaClinicaDTO findById(Long id);
    public ProcedimientoHistoriaClinicaDTO save(ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO);
    public List<ProcedimientoHistoriaClinicaDTO> getAll();
    public void delete(Long id);
    public ProcedimientoHistoriaClinicaDTO update( Integer id, ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO);
}