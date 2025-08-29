package com.taller1.taller1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Veterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idvet" , nullable = false)
    private Long idVet;

    @Column(name = "Nom", length = 50, nullable = false)
    private String nom;

    @Column(name = "Correo", length = 100, unique = true)
    private String correo;

    @Column(name = "Foto", length = 255)
    private String foto;

    @Column(name = "Direc", length = 100, unique = true)
    private String direc;
}
