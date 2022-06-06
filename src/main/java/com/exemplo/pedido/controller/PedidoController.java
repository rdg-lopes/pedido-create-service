package com.exemplo.pedido.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.util.UriComponentsBuilder;

import com.exemplo.pedido.service.CreatePedidoService;
import com.exemplo.pedido.service.PedidoInputModel;
import com.exemplo.pedido.service.PedidoModel;

@RestController
@RequestMapping("/v1/Pedido")
public class PedidoController {

	@Autowired
	private CreatePedidoService createPedidoService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PedidoDTO> create(@RequestBody PedidoInputDTO input, WebRequest context){
		PedidoMapper mapper = new PedidoMapper();
		PedidoInputModel model = mapper.map(input);
		model.setItens(mapper.mapToListItemModel(input.getItens()));
		PedidoModel modelCriado = createPedidoService.create(model);
		PedidoDTO dtoResult = mapper.map(modelCriado);
		dtoResult.setItens(mapper.mapToListItemDTO(modelCriado.getItens()));
		return ResponseEntity.created(newUri(dtoResult, context.getContextPath())).body(dtoResult);
	}

	private URI newUri(PedidoDTO dto, String contextPath) {
		return UriComponentsBuilder.fromPath(contextPath)
								   .path("/")
								   .path(dto.getNrPedido().toString())
								   .build().toUri();
	}
	
}
