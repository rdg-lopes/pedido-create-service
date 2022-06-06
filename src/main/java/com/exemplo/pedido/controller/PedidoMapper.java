package com.exemplo.pedido.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.exemplo.pedido.service.ItemPedidoModel;
import com.exemplo.pedido.service.PedidoInputModel;
import com.exemplo.pedido.service.PedidoModel;

public class PedidoMapper {
	
	public PedidoInputModel map(PedidoInputDTO dto) {
		PedidoInputModel model = new PedidoInputModel();
		model.setCodCliente(dto.getCodCliente());
		return model;
	}
	
	public PedidoDTO map(PedidoModel model) {
		PedidoDTO dto = new PedidoDTO();
		dto.setNrPedido(model.getNrPedido());
		dto.setCodCliente(model.getCodCliente());
		dto.setDtPedido(model.getDtPedido());
		return dto;
	}
	
	public ItemPedidoModel map(ItemPedidoDTO dto) {
		ItemPedidoModel model = new ItemPedidoModel();
		model.setCodProduto(dto.getCodProduto());
		model.setQtde(dto.getQtde());
		model.setVlUnitario(dto.getVlUnitario());
		return model;
	}
	
	public ItemPedidoDTO map(ItemPedidoModel model) {
		ItemPedidoDTO dto = new ItemPedidoDTO();
		dto.setCodProduto(model.getCodProduto());
		dto.setQtde(model.getQtde());
		dto.setVlUnitario(model.getVlUnitario());
		return dto;
	}
	
	
	public List<ItemPedidoModel> mapToListItemModel(List<ItemPedidoDTO> listInput){
		return listInput.stream().map(this::map).collect(Collectors.toList());
	}
	
	public List<ItemPedidoDTO> mapToListItemDTO(List<ItemPedidoModel> listInput){
		return listInput.stream().map(this::map).collect(Collectors.toList());
	}
	
}
