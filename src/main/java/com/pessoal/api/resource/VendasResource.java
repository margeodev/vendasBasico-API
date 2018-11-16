package com.pessoal.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.api.model.Venda;
import com.pessoal.api.repository.Vendas;

@RestController
@RequestMapping("/vendas")
public class VendasResource {

	@Autowired
	private Vendas vendasRep;
	
	@GetMapping
	public List<Venda> buscar() {
		return vendasRep.findAll();
	}
}
