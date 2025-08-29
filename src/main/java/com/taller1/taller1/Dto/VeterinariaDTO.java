package com.taller1.taller1.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VeterinariaDTO {
    private Long idVet;
    private String nom;
    private String correo;
    private String foto;
    private String direc;
}
