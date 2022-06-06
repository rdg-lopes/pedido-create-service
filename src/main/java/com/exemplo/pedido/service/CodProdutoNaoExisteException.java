package com.exemplo.pedido.service;

public class CodProdutoNaoExisteException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	private Integer codProduto;
	
	public CodProdutoNaoExisteException(Integer codProduto) {
		this.codProduto = codProduto;
	}
	
	@Override
	public String getMessage() {
		return "Não foi encontrado um produto com o código "+this.codProduto;
	}

}
