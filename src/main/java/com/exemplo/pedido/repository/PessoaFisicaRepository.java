package com.exemplo.pedido.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisicaEntity, Integer>  {

	Optional<PessoaFisicaEntity> findByCpf(String cpf);
	List<PessoaFisicaEntity> findByNomeContaining(String str, Pageable pag); 
	
}


