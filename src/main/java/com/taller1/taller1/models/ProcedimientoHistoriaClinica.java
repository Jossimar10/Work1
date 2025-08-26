package com.taller1.taller1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Procedimiento_HistoriaClinica")
@Data
public class ProcedimientoHistoriaClinica {

    @Id
    @Column(name = "IdProcedimiento", nullable = false)
    private Long idProcedimiento;

    @Column(name = "IdHistoria;", nullable = false)
    private Integer idHistoria;
}
