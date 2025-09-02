package com.taller1.taller1.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller1.taller1.dto.VeterinariaDTO;
import com.taller1.taller1.service.VeterinariaService;

@RestController
@RequestMapping("/veterinaria")
public class VeterinariaController  {
        private final VeterinariaService veterinariaService;

        public VeterinariaController(VeterinariaService veterinariaService){
            this.veterinariaService = veterinariaService;
        }

        @GetMapping("/{idVet}")
        public ResponseEntity<VeterinariaDTO> getById(@PathVariable Long idVet){
            return new ResponseEntity<>(veterinariaService.findById(idVet), HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<VeterinariaDTO> save(@RequestBody VeterinariaDTO veterinariaDTO){
            return new ResponseEntity<>(veterinariaService.save(veterinariaDTO), HttpStatus.OK);
        }

        @GetMapping("/veterinarias")
        public ResponseEntity<List<VeterinariaDTO>> getAll(){
            return new ResponseEntity<>(veterinariaService.getAll(), HttpStatus.OK);
        }

        @PutMapping("/veterinaria/{idVet}")
        public ResponseEntity<VeterinariaDTO> update(@PathVariable Long idVet, @RequestBody VeterinariaDTO veterinariaDTO){
            return new ResponseEntity<>(veterinariaService.update(idVet, veterinariaDTO), HttpStatus.OK);
        }

        @DeleteMapping("/veterinaria/{idVet}")
        public ResponseEntity<Void> delete(@PathVariable Long idVet){
            veterinariaService.delete(idVet);
            return new ResponseEntity<>(HttpStatus.OK);
        }


    }


    