package com.taller1.taller1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.taller1.taller1.Dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.models.ProcedimientoHistoriaClinica;

@Mapper
public interface ProcedimientoHistoriaClinicaMapper {

    ProcedimientoHistoriaClinicaMapper INSTANCE = Mappers.getMapper(ProcedimientoHistoriaClinicaMapper.class);

    ProcedimientoHistoriaClinicaDTO toDto(ProcedimientoHistoriaClinica entity);
    ProcedimientoHistoriaClinica toEntity(ProcedimientoHistoriaClinicaDTO dto);
}
