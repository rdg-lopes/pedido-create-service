package com.exemplo.pedido.controller;

import java.math.BigDecimal;

public class ItemPedidoDTO {

	private Integer codProduto;
	private BigDecimal qtde;
	private BigDecimal vlUnitario;

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public BigDecimal getQtde() {
		return qtde;
	}

	public void setQtde(BigDecimal qtde) {
		this.qtde = qtde;
	}

	public BigDecimal getVlUnitario() {
		return vlUnitario;
	}

	public void setVlUnitario(BigDecimal vlUnitario) {
		this.vlUnitario = vlUnitario;
	}

}
