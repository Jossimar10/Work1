package com.taller1.taller1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller1.taller1.repositories.VeterinariaRepositories;

@Service
public class VeterinariaServiceImpl {
   
    @Autowired
    private VeterinariaRepositories veterinariaRepositories;

    
    public VeterinariaServiceImpl(VeterinariaRepositories veterinariaRepositories) {
        this.veterinariaRepositories = veterinariaRepositories;
    }

    public void deleteVeterinaria(Long idVet) {
        veterinariaRepositories.deleteById(idVet);
    }

    

}
