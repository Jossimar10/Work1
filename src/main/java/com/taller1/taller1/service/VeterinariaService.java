package com.taller1.taller1.service;

import java.util.List;

import com.taller1.taller1.dto.VeterinariaDTO;

public interface VeterinariaService {
    public VeterinariaDTO findById(Long idVet);
    public VeterinariaDTO save(VeterinariaDTO veterinariaDTO);
    public List<VeterinariaDTO> getAll();
    public void delete(Long idVet);
    public VeterinariaDTO update(Long idVet, VeterinariaDTO veterinariaDTO);
}
