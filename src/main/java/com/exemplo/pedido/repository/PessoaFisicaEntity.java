package com.exemplo.pedido.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOAFISICA")
@PrimaryKeyJoinColumn(name = "CD_PESSOA")
public class PessoaFisicaEntity extends PessoaEntity {

	@Column(name = "NR_CPF")
	private String cpf;
	
	@Column(name = "NM_PESSOA")
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

