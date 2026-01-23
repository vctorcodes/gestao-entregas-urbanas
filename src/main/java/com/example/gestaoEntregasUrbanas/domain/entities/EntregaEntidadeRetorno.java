package com.example.gestaoEntregasUrbanas.domain.entities;

import com.example.gestaoEntregasUrbanas.domain.enums.StatusDoPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EntregaEntidadeRetorno(
        Long id,
        String codigoRastreamento,
        String nomeDestinatario,
        String bairro,
        String motoboy,
        StatusDoPedido statusDoPedido,
        LocalDateTime dataEntregaPrevista,
        BigDecimal valorEntrega
) {
}
