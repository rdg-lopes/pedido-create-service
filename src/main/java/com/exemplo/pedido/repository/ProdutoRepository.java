package com.exemplo.pedido.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {

	Optional<ProdutoEntity> findByCodProduto(Integer codProduto);
	
}
