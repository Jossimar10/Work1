package com.taller1.taller1.mapper;

import java.util.List;

import com.taller1.taller1.dto.VeterinariaDTO;
import com.taller1.taller1.models.Veterinaria;

public interface VeterinariaMapper {
    Veterinaria consultVete(VeterinariaDTO  veterinariaDTO);
    VeterinariaDTO consultVeterinariaDTO(Veterinaria veterinaria);
    List<VeterinariaDTO> listVeterinariaDTO(List<Veterinaria> veterinaria);
    void deleteVeterinaria(Veterinaria Veterinaria, VeterinariaDTO veterinariaDTO);
}
