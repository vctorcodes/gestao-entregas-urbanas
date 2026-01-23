package com.example.gestaoEntregasUrbanas.adapter.input.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EntregaInputMapper {

    EntregaInputMapper INSTANCE = Mappers.getMapper(EntregaInputMapper.class);

}
