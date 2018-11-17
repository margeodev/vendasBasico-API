package com.pessoal.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.api.model.Item;
import com.pessoal.api.repository.Itens;

@CrossOrigin("*")
@RestController
@RequestMapping("/itens")
public class ItensResource {

	@Autowired
	private Itens itensRep;
	
	@GetMapping
	public List<Item> buscar() {
		return itensRep.findAll();
	}
}
