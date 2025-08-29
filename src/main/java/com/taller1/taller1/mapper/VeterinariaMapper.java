package com.taller1.taller1.mapper;

import java.util.List;

import com.taller1.taller1.Dto.VeterinariaDTO;
import com.taller1.taller1.models.Veterinaria;

public interface VeterinariaMapper {
    List<VeterinariaDTO> listDtoVeterinariaDTOs (List<Veterinaria> veterinaria);
    VeterinariaDTO toVeterinariaDTO(Veterinaria veterinaria);
    Veterinaria toVeterinaria(VeterinariaDTO veterinariaDTO);
    Void deleteVeterinaria(Veterinaria veterinaria);
}
