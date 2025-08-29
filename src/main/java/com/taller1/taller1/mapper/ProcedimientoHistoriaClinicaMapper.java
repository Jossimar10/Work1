package com.taller1.taller1.mapper;


import java.util.List;

import com.taller1.taller1.dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.models.ProcedimientoHistoriaClinica;


public interface ProcedimientoHistoriaClinicaMapper {
    List<ProcedimientoHistoriaClinicaDTO> listDtoProcedimientoHistoriaClinicaDTOs(List<ProcedimientoHistoriaClinica> ProcedimientoHistoriaClinica);
    ProcedimientoHistoriaClinicaDTO save(ProcedimientoHistoriaClinica procedimientoHistoriaClinica);
    ProcedimientoHistoriaClinica toEntity(ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO);
    void deleteProcedimientoHistoriaClinica(ProcedimientoHistoriaClinica procedimientoHistoriaClinica);
}
