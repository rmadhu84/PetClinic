/**
 * 
 */
package com.springframework.PetClinic.services;

import java.util.Set;

import com.springframework.PetClinic.Model.Vet;

/**
 * @author ramachandranm1
 *
 */
public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
