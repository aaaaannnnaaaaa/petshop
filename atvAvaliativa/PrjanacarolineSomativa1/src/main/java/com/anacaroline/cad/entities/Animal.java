package com.anacaroline.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeAnimal;
	private String corAnimal;

	// id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// nomeCliente
	public String getnomeAnimal() {
		return nomeAnimal;
	}

	public void setnomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	// corAnimal
	public String getcorAnimal() {
		return corAnimal;
	}

	public void setcorAnimal(String corAnimal) {
		this.corAnimal = corAnimal;
	}

	
}

