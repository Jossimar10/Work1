package com.taller1.taller1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//@NoAllContructor
//@AllargsConstructor
//@Getter
@Entity
@Table(name = "Procedimiento_HistoriaClinica")
@Data
public class ProcedimientoHistoriaClinica {

    @Id
    //No sabia hacer autoincremental 
    @Column(name = "IdProcedimiento", nullable = false)
    private Long idProcedimiento;
    //No sabe que tipo de dato es Long
    @Column(name = "IdHistoria", nullable = false)
    private Integer idHistoria;
}
