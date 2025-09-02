package com.taller1.taller1.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.taller1.taller1.dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.models.ProcedimientoHistoriaClinica;

@Component
public class ProcedimientoHistoriaClinicaMapperImpl implements ProcedimientoHistoriaClinicaMapper {
    @Override
    public List<ProcedimientoHistoriaClinicaDTO> lProcedimientoHistoriaClinicaDTO(List<ProcedimientoHistoriaClinica> procedimientoHistoriaClinica) {
        if ( procedimientoHistoriaClinica == null ) {
            return null;
        }

        List<ProcedimientoHistoriaClinicaDTO> list = new ArrayList<ProcedimientoHistoriaClinicaDTO>( procedimientoHistoriaClinica.size() );
        for ( ProcedimientoHistoriaClinica procedimientoHistoriaClinica1 : procedimientoHistoriaClinica ) {
            list.add( save( procedimientoHistoriaClinica1 ) );
        }

        return list;
    }

    @Override
    public ProcedimientoHistoriaClinicaDTO save(ProcedimientoHistoriaClinica procedimientoHistoriaClinica) {
        if ( procedimientoHistoriaClinica == null ) {
            return null;
        }

        ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO = new ProcedimientoHistoriaClinicaDTO();

        procedimientoHistoriaClinicaDTO.setIdProcedimiento( procedimientoHistoriaClinica.getIdProcedimiento() );
        procedimientoHistoriaClinicaDTO.setIdHistoria( procedimientoHistoriaClinica.getIdHistoria() );

        return procedimientoHistoriaClinicaDTO;
    }

    @Override
    public ProcedimientoHistoriaClinica toEntity(ProcedimientoHistoriaClinicaDTO procedimientoHistoriaClinicaDTO) {
        if ( procedimientoHistoriaClinicaDTO == null ) {
            return null;
        }

        ProcedimientoHistoriaClinica procedimientoHistoriaClinica = new ProcedimientoHistoriaClinica();

        procedimientoHistoriaClinica.setIdProcedimiento( procedimientoHistoriaClinicaDTO.getIdProcedimiento() );
        procedimientoHistoriaClinica.setIdHistoria( procedimientoHistoriaClinicaDTO.getIdHistoria() );

        return procedimientoHistoriaClinica;
    }

    @Override
    public void deleteProcedimientoHistoriaClinica(ProcedimientoHistoriaClinica procedimientoHistoriaClinica) {
    }
}
