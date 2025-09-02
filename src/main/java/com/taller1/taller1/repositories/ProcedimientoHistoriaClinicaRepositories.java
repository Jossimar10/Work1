package com.taller1.taller1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taller1.taller1.models.ProcedimientoHistoriaClinica;

//usar camel case
//proceHistoRepo
public interface ProcedimientoHistoriaClinicaRepositories extends JpaRepository<ProcedimientoHistoriaClinica, Long> {

}
