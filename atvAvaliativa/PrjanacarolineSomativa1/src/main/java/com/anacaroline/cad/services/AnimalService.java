package com.anacaroline.cad.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anacaroline.cad.entities.Animal;
import com.anacaroline.cad.repositories.AnimalRepository;

@Service
public class AnimalService {
	
	private final AnimalRepository animalrepository;
	
	@Autowired
	public AnimalService(AnimalRepository animalrepository) {
		this.animalrepository = animalrepository;
	}
	
	//criaçao do produto
	public Animal saveAnimal(Animal animal) {
		return animalrepository.save(animal);
	}
	
	//buscar produto
	public Animal getAnimalById( Long id ) {
		return animalrepository.findById(id).orElse(null);
	}
	
	//procurar todos os produtos
	public List<Animal> getAllAmnimal() {
		return animalrepository.findAll();
	}
	
	//excluir os produtos 
	public void deleteAnimal(Long id) {
		animalrepository.deleteById(id);
	}	

}

