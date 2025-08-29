package com.taller1.taller1.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.taller1.taller1.Dto.ProcedimientoHistoriaClinicaDTO;
import com.taller1.taller1.Dto.VeterinariaDTO;
import com.taller1.taller1.models.ProcedimientoHistoriaClinica;
import com.taller1.taller1.models.Veterinaria;

@Component
public class VeterinariaMapperImpl implements VeterinariaMapper {
    @Override
    public List<VeterinariaDTO> listDtoVeterinariaDTOs(List<Veterinaria> veterinaria) {
        if (veterinaria == null)  {
            return null;
        }

        List<VeterinariaDTO> list = new ArrayList<VeterinariaDTO>(veterinaria.size() );
        for (Veterinaria veterinaria2 : veterinaria) {
            list.add( toVeterinariaDTO(veterinaria2));
        }
        return list;
    }

    @Override
    public VeterinariaDTO toVeterinariaDTO(Veterinaria veterinaria){
        if ( veterinaria == null ) {
            return null;
        }

        VeterinariaDTO veterinariaDTO = new VeterinariaDTO();

        veterinariaDTO.setIdVet(veterinaria.getIdVet());
        veterinariaDTO.setNom(veterinaria.getNom());
        veterinariaDTO.setCorreo(veterinaria.getCorreo());
        veterinariaDTO.setFoto(veterinaria.getFoto());
        veterinariaDTO.setDirec(veterinaria.getDirec());

        return veterinariaDTO;
    }

    @Override
    public Veterinaria toVeterinaria(VeterinariaDTO veterinariaDTO) {
        if ( veterinariaDTO == null ) {
            return null;
        }
 
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.setIdVet(veterinariaDTO.getIdVet());
        veterinaria.setNom(veterinariaDTO.getNom());
        veterinaria.setCorreo(veterinariaDTO.getCorreo());
        veterinaria.setFoto(veterinariaDTO.getFoto());
        veterinaria.setDirec(veterinariaDTO.getDirec());

        return veterinaria;
    }

    @Override
    public void deleteVeterinaria(Veterinaria veterinaria){

    }
}



    

