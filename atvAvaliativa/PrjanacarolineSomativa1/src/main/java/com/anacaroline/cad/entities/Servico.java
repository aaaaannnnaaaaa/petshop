package com.anacaroline.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cadastroCliente;
	private String cadastroAnimal;

	// id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// cadastroCliente
	public String getcadastroCliente() {
		return cadastroCliente;
	}

	public void setcadastroCliente(String cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	// cadastroAnimal
	public String getcadastroAnimal() {
		return cadastroAnimal;
	}

	public void setcadastroAnimal(String cadastroAnimal) {
		this.cadastroAnimal = cadastroAnimal;
	}

	
}

