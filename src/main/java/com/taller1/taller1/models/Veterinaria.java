package com.taller1.taller1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Veterinaria")
public class Veterinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idVete;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 100, unique = true)
    private String correo;

    @Column(length = 255)
    private String foto;

    @Column(length = 100, unique = true)
    private String direc;
}
