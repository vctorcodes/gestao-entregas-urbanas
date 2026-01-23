package com.example.gestaoEntregasUrbanas.adapter.output.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EntregaOutputMapper{

    EntregaOutputMapper INSTANCE = Mappers.getMapper(EntregaOutputMapper.class);

    
}
