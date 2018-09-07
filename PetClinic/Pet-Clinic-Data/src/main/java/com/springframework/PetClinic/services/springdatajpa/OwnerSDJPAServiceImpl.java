/**
 * 
 */
package com.springframework.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Owner;
import com.springframework.PetClinic.Repositories.OwnerRepository;
import com.springframework.PetClinic.Repositories.PetRepository;
import com.springframework.PetClinic.Repositories.PetTypeRepository;
import com.springframework.PetClinic.services.OwnerService;

/**
 * @author Madhu
 *
 */
@Service
@Profile("jpa")
public class OwnerSDJPAServiceImpl implements OwnerService {

	private final OwnerRepository ownerRepo;
	private final PetRepository petRepo;
	private final PetTypeRepository petTypeRepo;
	
	
	
	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		ownerRepo.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepo.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner owner) {
		return ownerRepo.save(owner);
	}

	@Override
	public void delete(Owner owner) {
		ownerRepo.delete(owner);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepo.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepo.findByLastName(lastName);
	}

	/**
	 * @param ownerRepo
	 * @param petRepo
	 * @param petTypeRepo
	 */
	@Autowired
	public OwnerSDJPAServiceImpl(OwnerRepository ownerRepo, 
			PetRepository petRepo, PetTypeRepository petTypeRepo) {
		super();
		this.ownerRepo = ownerRepo;
		this.petRepo = petRepo;
		this.petTypeRepo = petTypeRepo;
	}

}
