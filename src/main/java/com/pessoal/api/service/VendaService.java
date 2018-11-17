package com.pessoal.api.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.api.model.Cliente;
import com.pessoal.api.model.Produto;
import com.pessoal.api.model.Venda;
import com.pessoal.api.repository.Clientes;
import com.pessoal.api.repository.Produtos;
import com.pessoal.api.repository.Vendas;

@Service
public class VendaService {

	@Autowired
	private Vendas vendasRep;
	
	@Autowired
	private Produtos produtosRep;
	
	@Autowired
	private Clientes clientesRep;	
	
	public Venda adicionar(Venda venda) {
		venda.setDataCadastro(LocalDateTime.now());
		venda.setCliente(clientesRep.findById(venda.getCliente().getId()).get());
		setarItensProdutosDaVenda(venda);
		calcularTotal(venda);

		return vendasRep.save(venda);		
	}
	
	private void setarItensProdutosDaVenda(Venda venda) {
		venda.getItens().forEach(i -> {
			Produto produto = produtosRep.findById(i.getProduto().getId()).get();			
			i.setVenda(venda);
			i.setProduto(produto);
		});
	}
	
	private void calcularTotal(Venda venda) {
		BigDecimal total = venda.getItens().stream().map(i -> i.getProduto().
				getPreco().multiply(new BigDecimal(i.getQuantidade()))).
				reduce(BigDecimal.ZERO, BigDecimal::add);
		venda.setValorTotal(total.add(venda.getValorFrete()));
	}
}
