package com.exemplo.pedido.service;

import java.util.Date;
import java.util.List;

public class PedidoModel {

	private Integer nrPedido;
	private Date dtPedido;
	private Integer codCliente;
	private List<ItemPedidoModel> itens;

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

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public List<ItemPedidoModel> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedidoModel> itens) {
		this.itens = itens;
	}

}
