package com.exemplo.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NrPedidoRepository extends JpaRepository<NrPedidoEntity, Integer> {

}
