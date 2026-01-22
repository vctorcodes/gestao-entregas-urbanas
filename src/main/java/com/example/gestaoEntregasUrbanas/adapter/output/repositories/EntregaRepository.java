package com.example.gestaoEntregasUrbanas.adapter.output.repositories;

import com.example.gestaoEntregasUrbanas.adapter.output.dataBase.EntregaDataBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntregaRepository extends JpaRepository<EntregaDataBase, Long> {
}
