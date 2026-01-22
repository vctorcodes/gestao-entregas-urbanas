package com.example.gestaoEntregasUrbanas.adapter.input.dto;

import com.example.gestaoEntregasUrbanas.domain.enums.StatusDoPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EntregaRequestDTO(
        String codigoRastreamento,
        String nomeDestinatario,
        String telefoneDestinatario,
        String enderecoEntrega,
        String bairro,
        String motoboy,
        LocalDateTime dataColeta,
        LocalDateTime dataEntregaPrevista,
        StatusDoPedido statusDoPedido,
        BigDecimal valorEntrega,
        Boolean fragil
) {
}
