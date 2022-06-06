package com.exemplo.pedido.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.pedido.repository.ItemPedidoEntity;
import com.exemplo.pedido.repository.ItemPedidoIdEntity;
import com.exemplo.pedido.repository.NrPedidoEntity;
import com.exemplo.pedido.repository.NrPedidoRepository;
import com.exemplo.pedido.repository.PedidoEntity;
import com.exemplo.pedido.repository.PedidoRepository;
import com.exemplo.pedido.repository.PessoaFisicaEntity;
import com.exemplo.pedido.repository.PessoaFisicaRepository;
import com.exemplo.pedido.repository.ProdutoEntity;
import com.exemplo.pedido.repository.ProdutoRepository;

@Service
public class CreatePedidoService {

	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private NrPedidoRepository nrPedidoRepository;
	
	public PedidoModel create(PedidoInputModel input) {
		
		PedidoMapper mapper = new PedidoMapper();
		
		PedidoEntity pedidoEntity = mapper.map(input);
		pedidoEntity.setNrPedido(newNrPedido());
		pedidoEntity.setItens(new ArrayList<ItemPedidoEntity>());
		
		PessoaFisicaEntity cliente = this.pessoaFisicaRepository.getById(input.getCodCliente());
		if(Objects.isNull(cliente)){
			throw new CodClienteNaoExisteException(input.getCodCliente());
		}
		pedidoEntity.setCliente(cliente);
		pedidoEntity.setDtPedido(new Date());
		
		for(ItemPedidoModel item : input.getItens()) {
			ProdutoEntity produtoEntity = this.produtoRepository.getById(item.getCodProduto());
			if(Objects.isNull(produtoEntity)) {
				throw new CodProdutoNaoExisteException(item.getCodProduto());
			}
			ItemPedidoEntity itemEntity = mapper.map(item);
			itemEntity.setId(new ItemPedidoIdEntity());
			itemEntity.getId().setPedido(pedidoEntity);
			itemEntity.getId().setProduto(produtoEntity);
			pedidoEntity.getItens().add(itemEntity);
		}
		
		this.pedidoRepository.save(pedidoEntity);
		PedidoModel modelResult = mapper.map(pedidoEntity);
		modelResult.setItens(mapper.mapToListItemModel(pedidoEntity.getItens()));
		return modelResult;
	}

	private Integer newNrPedido() {
		NrPedidoEntity entity = new NrPedidoEntity();
		entity.setDtPedido(new Date());
		this.nrPedidoRepository.save(entity);
		return entity.getNrPedido();
	}
	
}
