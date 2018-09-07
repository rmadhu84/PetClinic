package com.springframework.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.PetType;
import com.springframework.PetClinic.Repositories.PetTypeRepository;
import com.springframework.PetClinic.services.PetTypeService;

@Service
@Profile("jpa")
public class PetTypeSDJPAServiceImpl implements PetTypeService {
	
	private final PetTypeRepository petTypeRepo;
	

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<PetType>();
		petTypeRepo.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepo.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType petType) {
		return petTypeRepo.save(petType);
	}

	@Override
	public void delete(PetType petType) {
		petTypeRepo.delete(petType);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepo.deleteById(id);
	}

	/**
	 * @param petTypeRepo
	 */
	@Autowired
	public PetTypeSDJPAServiceImpl(PetTypeRepository petTypeRepo) {
		super();
		this.petTypeRepo = petTypeRepo;
	}

}
