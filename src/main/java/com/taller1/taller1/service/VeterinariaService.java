package com.taller1.taller1.service;

import java.util.List;

import com.taller1.taller1.dto.Veterinariadto;

public interface VeterinariaService {
    public Veterinariadto findById(Long idVet);
    public Veterinariadto save(Veterinariadto veterinariaDTO);
    public List<Veterinariadto> getAll();
    public void delete(Long idVet);
    public Veterinariadto update(Integer idVet, Veterinariadto veterinariaDTO);
}
