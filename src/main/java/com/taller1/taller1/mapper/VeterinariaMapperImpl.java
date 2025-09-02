package com.taller1.taller1.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.taller1.taller1.dto.VeterinariaDTO;
import com.taller1.taller1.models.Veterinaria;


//delete X
@Component
public class VeterinariaMapperImpl implements VeterinariaMapper {

    @Override
    public Veterinaria consultVete(VeterinariaDTO veterinariaDTO) {
    if ( veterinariaDTO == null ) {
        return null;
    }
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.setIdVete( veterinariaDTO.getIdVet() );
        veterinaria.setNombre( veterinariaDTO.getNom() );
        veterinaria.setDirec( veterinariaDTO.getDirec() );
        veterinaria.setCorreo( veterinariaDTO.getCorreo() );
        return veterinaria;
}

    @Override
    public VeterinariaDTO consultVeterinariaDTO(Veterinaria veterinaria) {
        if ( veterinaria == null ) {
            return null;
        }
        VeterinariaDTO veterinariaDTO = new VeterinariaDTO();
        veterinariaDTO.setIdVet( veterinaria.getIdVete() );
        veterinariaDTO.setNom( veterinaria.getNombre() );
        veterinariaDTO.setDirec( veterinaria.getDirec() );
        veterinariaDTO.setCorreo( veterinaria.getCorreo() );
        return veterinariaDTO;
    }

    @Override
    public List<VeterinariaDTO> listVeterinariaDTO(List<Veterinaria> veterinaria) {
        if ( veterinaria == null ) {
            return null;
        }
        List<VeterinariaDTO> list = new ArrayList<VeterinariaDTO>( veterinaria.size() );
        for ( Veterinaria veterinaria1 : veterinaria ) {
            list.add( consultVeterinariaDTO( veterinaria1 ) );
        }
        return list;
    }

    @Override
    public void deleteVeterinaria(Veterinaria Veterinaria, VeterinariaDTO veterinariaDTO) {
        if ( veterinariaDTO == null ) {
            return;
        }
        Veterinaria.setNombre( veterinariaDTO.getNom());
        Veterinaria.setDirec( veterinariaDTO.getDirec() );
        Veterinaria.setCorreo( veterinariaDTO.getCorreo() );
    }
        


}

    

