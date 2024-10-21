package com.anacaroline.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anacaroline.cad.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
