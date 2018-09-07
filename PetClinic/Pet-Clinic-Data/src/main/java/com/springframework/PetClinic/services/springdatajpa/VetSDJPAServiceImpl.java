/**
 * 
 */
package com.springframework.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.Repositories.VetRepository;
import com.springframework.PetClinic.services.VetService;

/**
 * @author Madhu
 *
 */
@Service
@Profile("jpa")
public class VetSDJPAServiceImpl implements VetService {

	private final VetRepository vetRepo;

	@Override
	public Set<Vet> findAll() {
		Set<Vet> allVets = new HashSet<Vet>();
		vetRepo.findAll().forEach(allVets::add);
		return allVets ;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepo.findById(id).orElseGet(null);
	}

	@Override
	public Vet save(Vet vet) {
		return vetRepo.save(vet);
	}

	@Override
	public void delete(Vet vet) {
		vetRepo.delete(vet);
	}

	@Override
	public void deleteById(Long id) {
		vetRepo.deleteById(id);
	}

	/**
	 * @param vetRepo
	 */
	@Autowired
	public VetSDJPAServiceImpl(VetRepository vetRepo) {
		super();
		this.vetRepo = vetRepo;
	}

}
