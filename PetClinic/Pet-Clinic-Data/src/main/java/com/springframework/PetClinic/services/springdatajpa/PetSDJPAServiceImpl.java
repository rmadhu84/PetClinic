package com.springframework.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Pet;
import com.springframework.PetClinic.Repositories.PetRepository;
import com.springframework.PetClinic.services.PetService;

/**
 * 
 * @author Madhu
 * 
 *
 */
@Service
@Profile("jpa")

public class PetSDJPAServiceImpl implements PetService {

	private final PetRepository petRepo;
	
	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<Pet>();
		petRepo.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		return petRepo.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet pet) {
		return petRepo.save(pet);
	}

	@Override
	public void delete(Pet pet) {
		petRepo.delete(pet);
	}

	@Override
	public void deleteById(Long id) {
		petRepo.deleteById(id);
	}

	/**
	 * @param petRepo
	 */
	@Autowired
	public PetSDJPAServiceImpl(PetRepository petRepo) {
		super();
		this.petRepo = petRepo;
	}

}
