package com.exemplo.pedido.service;

import java.util.List;
import java.util.stream.Collectors;

import com.exemplo.pedido.repository.ItemPedidoEntity;
import com.exemplo.pedido.repository.PedidoEntity;

public class PedidoMapper {

	public PedidoEntity map(PedidoInputModel input) {
		PedidoEntity entity = new PedidoEntity();
		return entity;
	}
	
	public ItemPedidoEntity map(ItemPedidoModel model) {
		ItemPedidoEntity entity = new ItemPedidoEntity();
		entity.setQtde(model.getQtde());
		entity.setVlUnitario(model.getVlUnitario());
		return entity;
	}
	
	public PedidoModel map(PedidoEntity entity) {
		PedidoModel model = new PedidoModel();
		model.setNrPedido(entity.getNrPedido());
		model.setDtPedido(entity.getDtPedido());
		model.setCodCliente(entity.getCliente().getCodPessoa());
		return model;
	}
	
	public ItemPedidoModel map(ItemPedidoEntity entity) {
		ItemPedidoModel model = new ItemPedidoModel();
		model.setCodProduto(entity.getId().getProduto().getCodProduto());
		model.setQtde(entity.getQtde());
		model.setVlUnitario(entity.getVlUnitario());
		return model;
	}
	
	public List<ItemPedidoModel> mapToListItemModel(List<ItemPedidoEntity> listEntity){
		return listEntity.stream().map(this::map).collect(Collectors.toList());
	}
	
}
