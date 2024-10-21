package com.anacaroline.cad.controllers;

import java.util.List;

import com.anacaroline.cad.entities.Animal;
import com.anacaroline.cad.entities.Cliente;
import com.anacaroline.cad.services.AnimalService;
import com.anacaroline.cad.services.ClienteService;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
	private final AnimalService animalService;
	
	@Autowired
	public AnimalController(AnimalService animalservice) {
		this.animalService = animalservice;
	}
	
	@PostMapping
	public Cliente creatAnimal(@RequestAttribute Animal animal) {
		return animalService.saveAnimal(animal);
	}
	
	@GetMapping
	public List<Animal> getAllProduct() {
		return AnimalService.getAllAnimal();	
	}
	
	@GetMapping("/{id}")
	public Animal getAnimal(@PathVariable Long id) {
		return AnimalService.getAnimalById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAnimal(@PathVariable Long id) {
		AnimalService.deleteAnimal(id);
	}
	
	//fazer o endpoint de update
	@PutMapping("/{id}")
	public Animal updateAnimal(@PathVariable Long id, @RequestBody Animal animal) {
		return AnimalService.updateAnimal(id, animal);
	}
	

}
