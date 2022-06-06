package com.exemplo.pedido.controller;

import java.util.List;

public class PedidoInputDTO {

	private Integer codCliente;
	private List<ItemPedidoDTO> itens;

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public List<ItemPedidoDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedidoDTO> itens) {
		this.itens = itens;
	}

}
