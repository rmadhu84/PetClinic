/**
 * 
 */
package com.springframework.PetClinic.services;

import java.util.Set;

import com.springframework.PetClinic.Model.Pet;

/**
 * @author ramachandranm1
 *
 */
public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
