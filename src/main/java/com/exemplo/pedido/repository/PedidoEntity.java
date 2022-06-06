package com.exemplo.pedido.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class PedidoEntity {

	@Id
	@Column(name = "NR_PEDIDO")
	private Integer nrPedido;
	
	@Column(name = "DT_PEDIDO")
	private Date dtPedido;
	
	@ManyToOne
	@JoinColumn(name = "CD_CLIENTE")
	private PessoaEntity cliente;
	
	@OneToMany(mappedBy = "id.pedido", cascade = CascadeType.ALL)
	private List<ItemPedidoEntity> itens;

	public Integer getNrPedido() {
		return nrPedido;
	}

	public void setNrPedido(Integer nrPedido) {
		this.nrPedido = nrPedido;
	}

	public Date getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}

	public PessoaEntity getCliente() {
		return cliente;
	}

	public void setCliente(PessoaEntity cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedidoEntity> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedidoEntity> itens) {
		this.itens = itens;
	}

}
