package com.exemplo.pedido.service;

public class CodClienteNaoExisteException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	private Integer codCliente;
	
	public CodClienteNaoExisteException(Integer codCliente) {
		this.codCliente = codCliente;
	}
	
	@Override
	public String getMessage() {
		return "Não foi encontrado um cliente com o código "+this.codCliente;
	}

}
