package com.taller1.taller1.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taller1.taller1.mapper.ProcedimientoHistoriaClinicaMapper;

@Configuration
public class MapperConfig {
@Bean 
public ProcedimientoHistoriaClinicaMapper procedimientoHistoriaClinicaMapper() {
    return Mappers.getMapper(ProcedimientoHistoriaClinicaMapper.class);
}
}
