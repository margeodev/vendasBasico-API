package com.pessoal.api.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pessoal.api.model.Venda;
import com.pessoal.api.repository.Vendas;
import com.pessoal.api.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResource {

	@Autowired
	private Vendas vendasRep;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> buscar() {
		return vendasRep.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Venda> adicionar(@RequestBody @Valid Venda venda) {
		Venda vendaSalva =  vendaService.adicionar(venda);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().
			path("/{id}").buildAndExpand(vendaSalva.getId()).toUri();
		
		return ResponseEntity.created(uri).body(vendaSalva);
	}
}
