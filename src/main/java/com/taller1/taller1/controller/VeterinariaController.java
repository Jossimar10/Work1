package com.taller1.taller1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller1.taller1.models.Veterinaria;
import com.taller1.taller1.repositories.VeterinariaRepositories;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/veterinarias")
public class VeterinariaController {

    @Autowired
    private VeterinariaRepositories repositories;

    @GetMapping
    public List<Veterinaria> getAll() {
        return repositories.findAll();
    }
    
}
