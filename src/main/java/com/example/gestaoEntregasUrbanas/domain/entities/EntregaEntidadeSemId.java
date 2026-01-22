package com.example.gestaoEntregasUrbanas.domain.entities;

import com.example.gestaoEntregasUrbanas.domain.enums.StatusDoPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EntregaEntidadeSemId(
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
){
}
