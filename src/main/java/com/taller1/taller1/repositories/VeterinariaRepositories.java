package com.taller1.taller1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller1.taller1.models.Veterinaria;

//uso Repository
//No pudo explicar su funcion
@Repository
public interface VeterinariaRepositories extends JpaRepository<Veterinaria, Long> {

}
