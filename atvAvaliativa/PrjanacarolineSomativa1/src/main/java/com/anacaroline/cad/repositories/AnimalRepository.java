package com.anacaroline.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anacaroline.cad.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
