package com.taller1.taller1.mapper;

import java.util.List;

import com.taller1.taller1.dto.Veterinariadto;
import com.taller1.taller1.models.Veterinaria;

public interface VeterinariaMapper {
    Veterinaria consultVete(Veterinariadto veterinariaDTO);
    Veterinariadto toVeterinariadto(Veterinaria veterinaria);
    List<Veterinariadto> listDtoVeterinariaDTOs(List<Veterinaria> veterinaria);
    void deleteVeterinaria(Veterinaria Veterinaria, Veterinariadto veterinariaDTO);
}
