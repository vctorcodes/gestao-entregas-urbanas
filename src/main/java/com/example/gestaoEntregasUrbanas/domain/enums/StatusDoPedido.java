package com.example.gestaoEntregasUrbanas.domain.enums;

public enum StatusDoPedido {
    PENDENTE(1,"Pendente"),
    EM_ROTA(2, "Em Rota"),
    ENTREGUE(3, "Entregue"),
    CANCELADA(4, "Cancelada");

    private final String statusDoPedido;
    private final int idDeStatusDoPedido;

    StatusDoPedido( int idDeStatusDoPedido, String statusDoPedido) {
        this.idDeStatusDoPedido = idDeStatusDoPedido;
        this.statusDoPedido = statusDoPedido;
    }

    public String getStatusDoPedido() {
        return this.statusDoPedido;
    }

    public int getIdDeStatusDoPedido() {
        return idDeStatusDoPedido;
    }
}
