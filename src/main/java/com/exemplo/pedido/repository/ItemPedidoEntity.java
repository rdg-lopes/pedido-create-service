package com.exemplo.pedido.repository;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedidoEntity {

	@EmbeddedId
	private ItemPedidoIdEntity id;

	@Column(name = "QT_PRODUTO")
	private BigDecimal qtde;

	@Column(name = "VL_UNITARIO")
	private BigDecimal vlUnitario;

	public ItemPedidoIdEntity getId() {
		return id;
	}

	public void setId(ItemPedidoIdEntity id) {
		this.id = id;
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
