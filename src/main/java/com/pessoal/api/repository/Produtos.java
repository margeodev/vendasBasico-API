package com.pessoal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.api.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
