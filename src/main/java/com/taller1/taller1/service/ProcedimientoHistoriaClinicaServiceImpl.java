package com.taller1.taller1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller1.taller1.dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.mapper.ProcedimientoHistoriaClinicaMapper;
import com.taller1.taller1.models.ProcedimientoHistoriaClinica;
import com.taller1.taller1.repositories.ProcedimientoHistoriaClinicaRepositories;

//Autowired x
//codigo Regular --
@Service
public class ProcedimientoHistoriaClinicaServiceImpl implements ProcedimientoHistoriaClinicaService {

    @Autowired
    private ProcedimientoHistoriaClinicaRepositories procedimientoHistoriaClinicaRepositories;

    @Autowired
    private ProcedimientoHistoriaClinicaMapper procedimientoHistoriaClinicaMapper;

    @Override
    public ProcedimientoHistoriaClinicaDTO findById(Long id) {
        ProcedimientoHistoriaClinica procedimientoHistoriaClinica = procedimientoHistoriaClinicaRepositories.findById(id)
                .orElseThrow(() -> new RuntimeException("ProcedimientoHistoriaClinica not found with id: " + id));
        return procedimientoHistoriaClinicaMapper.save(procedimientoHistoriaClinica);
    }

    @Override
    public ProcedimientoHistoriaClinicaDTO save(ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        ProcedimientoHistoriaClinica procedimientoHistoriaClinica = procedimientoHistoriaClinicaMapper.toEntity(procedimientoHistoriaClinicaDTO);
        ProcedimientoHistoriaClinica savedEntity = procedimientoHistoriaClinicaRepositories.save(procedimientoHistoriaClinica);
        return procedimientoHistoriaClinicaMapper.save(savedEntity);
    }

    @Override
    public List<ProcedimientoHistoriaClinicaDTO> getAll() {
        List<ProcedimientoHistoriaClinica> entities = procedimientoHistoriaClinicaRepositories.findAll();
        return entities.stream()
                .map(procedimientoHistoriaClinicaMapper::save)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if (procedimientoHistoriaClinicaRepositories.existsById(id)) {
            throw new RuntimeException("ProcedimientoHistoriaClinica not found with id: " + id);
        }
        procedimientoHistoriaClinicaRepositories.deleteById(id);
    }

    @Override
    public ProcedimientoHistoriaClinicaDTO update(Integer id, ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        if (procedimientoHistoriaClinicaRepositories.existsById(id.longValue())) {
            throw new RuntimeException("ProcedimientoHistoriaClinica not found with id: " + id);
        }
        procedimientoHistoriaClinicaDTO.setIdProcedimiento(id.longValue());
        return save(procedimientoHistoriaClinicaDTO);
    }

}
