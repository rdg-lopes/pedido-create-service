package com.exemplo.pedido.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NR_PEDIDO")
public class NrPedidoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NR_PEDIDO")
	private Integer nrPedido;
	
	@Column(name = "DT_CREATE")
	private Date dtPedido;

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

}
