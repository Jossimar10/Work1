package com.taller1.taller1.dto;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="veterinaria")
public class VeterinariaDTO {
    private Long idVet;
    private String nom;
    private String correo;
    private String direc;
}

