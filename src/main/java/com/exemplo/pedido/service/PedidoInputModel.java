package com.exemplo.pedido.service;

import java.util.List;

public class PedidoInputModel {

	private Integer codCliente;
	private List<ItemPedidoModel> itens;

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
