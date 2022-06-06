package com.exemplo.pedido.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class ProdutoEntity {

	@Id
	@Column(name = "CD_PRODUTO")
	private Integer codProduto;
	
	@Column(name = "NM_PRODUTO")
	private String nome;
	
	@Column(name = "DS_PRODUTO")
	private String descricao;

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
