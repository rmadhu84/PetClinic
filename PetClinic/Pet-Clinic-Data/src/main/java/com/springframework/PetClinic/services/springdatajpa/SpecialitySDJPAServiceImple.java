package com.springframework.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Speciality;
import com.springframework.PetClinic.Repositories.SpecialityRepository;
import com.springframework.PetClinic.services.SpecialityService;

@Service
@Profile("jpa")

public class SpecialitySDJPAServiceImple implements SpecialityService {

	private final SpecialityRepository specialityRepo;
	
	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<Speciality>();
		specialityRepo.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepo.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality speciality) {
		return specialityRepo.save(speciality);
	}

	@Override
	public void delete(Speciality speciality) {
		specialityRepo.delete(speciality);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepo.deleteById(id);
	}

	/**
	 * @param specialityRepo
	 */
	@Autowired
	public SpecialitySDJPAServiceImple(SpecialityRepository specialityRepo) {
		super();
		this.specialityRepo = specialityRepo;
	}

}
