package com.exemplo.pedido.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaEntity {

	@Id
	@Column(name = "CD_PESSOA")
	private Integer codPessoa;

	@Column(name = "TP_PESSOA")
	private Integer tpPessoa;

	public Integer getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Integer codPessoa) {
		this.codPessoa = codPessoa;
	}

	public Integer getTpPessoa() {
		return tpPessoa;
	}

	public void setTpPessoa(Integer tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

}
