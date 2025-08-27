package com.taller1.taller1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller1.taller1.Dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.mapper.ProcedimientoHistoriaClinicaMapper;
import com.taller1.taller1.models.ProcedimientoHistoriaClinica;
import com.taller1.taller1.repositories.ProcedimientoHistoriaClinicaRepositories;

@Service
public class ProcedimientoHistoriaClinicaServiceImpl implements ProcedimientoHistoriaClinicaService {

    @Autowired
    private ProcedimientoHistoriaClinicaRepositories repositories;

    @Autowired
    private ProcedimientoHistoriaClinicaMapper mapper;

    @Override
    public List<ProcedimientoHistoriaClinicaDTO> getAll() {
        return repositories.findAll().stream()
        .map(mapper::toDto)
        .collect(Collectors.toList());
    }

    @Override
    public ProcedimientoHistoriaClinicaDTO save(ProcedimientoHistoriaClinicaDTO dto) {
        ProcedimientoHistoriaClinica entity = mapper.toEntity(dto);
        entity = repositories.save(entity);
        return mapper.toDto(entity);
    }
}
