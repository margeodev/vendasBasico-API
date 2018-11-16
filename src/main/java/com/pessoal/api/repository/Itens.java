package com.pessoal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.api.model.Item;

public interface Itens extends JpaRepository<Item, Long> {

}
