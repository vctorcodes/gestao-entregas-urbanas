package com.example.gestaoEntregasUrbanas.adapter.output.dataBase;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_repositorio")
public class EntregaDataBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
