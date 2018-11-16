package com.pessoal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.api.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
