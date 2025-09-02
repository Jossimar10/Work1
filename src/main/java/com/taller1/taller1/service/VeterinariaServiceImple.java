package com.taller1.taller1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller1.taller1.dto.VeterinariaDTO;
import com.taller1.taller1.mapper.VeterinariaMapper;
import com.taller1.taller1.models.Veterinaria;
import com.taller1.taller1.repositories.VeterinariaRepositories;

@Service
public class VeterinariaServiceImple implements VeterinariaService{
    @Autowired
    private VeterinariaRepositories veterinariaRepositories;

    @Autowired
    private VeterinariaMapper veterinariaMapper;

    @Override
    public VeterinariaDTO findById(Long idVet) {
        Veterinaria veterinaria = veterinariaRepositories.findById(idVet).orElse(null);
        return veterinariaMapper.consultVeterinariaDTO(veterinaria);
    }

    @Override
    public VeterinariaDTO save(VeterinariaDTO veterinariaDTO) {
        Veterinaria veterinaria = veterinariaMapper.consultVete(veterinariaDTO);
        return veterinariaMapper.consultVeterinariaDTO(veterinariaRepositories.save(veterinaria));
    }

    @Override
    public List<VeterinariaDTO> getAll() {
        List<Veterinaria> veterinrias = veterinariaRepositories.findAll();
        return veterinariaMapper.listVeterinariaDTO(veterinrias);
}

    @Override
    public void delete(Long idVet) {
        veterinariaRepositories.deleteById(idVet);
    }

    @Override
    public VeterinariaDTO update(Long idVet, VeterinariaDTO veterinariaDTO) {
        Veterinaria veterinaria = veterinariaRepositories.findById(idVet).get();
        veterinariaMapper.deleteVeterinaria(veterinaria, veterinariaDTO);
        return veterinariaMapper.consultVeterinariaDTO(veterinariaRepositories.save(veterinaria));
    }
}

