package com.example.gestaoEntregasUrbanas.adapter.input.dto;


import com.example.gestaoEntregasUrbanas.domain.enums.StatusDoPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EntregaResponseDTO(
        Long id,
        String codigoRastreamento,
        String nomeDestinatario,
        String bairro,
        String motoboy,
        StatusDoPedido  statusDoPedido,
        LocalDateTime dataEntregaPrevista,
        BigDecimal valorEntrega
) {
}
