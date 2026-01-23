package com.example.gestaoEntregasUrbanas.adapter.input.dto;

import com.example.gestaoEntregasUrbanas.domain.enums.StatusDoPedido;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public record EntregaRequestDTO(
        //"
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String codigoRastreamento,
        
        @NotBlank
        String nomeDestinatario,
        
        @NotBlank
        String telefoneDestinatario,
        
        @NotBlank
        String enderecoEntrega,

        @NotBlank
        String bairro,

        @NotBlank
        String motoboy,

        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime dataColeta,
        
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime dataEntregaPrevista,

        @Enumerated(EnumType.STRING)
        @NotNull
        StatusDoPedido statusDoPedido,

        @NotNull
        BigDecimal valorEntrega,

        @NotNull
        Boolean fragil
) {
}
