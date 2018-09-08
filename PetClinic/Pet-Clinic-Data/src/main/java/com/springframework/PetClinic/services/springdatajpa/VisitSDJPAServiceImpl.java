/**
 * 
 */
package com.springframework.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.springframework.PetClinic.Model.Visit;
import com.springframework.PetClinic.Repositories.VisitRepository;
import com.springframework.PetClinic.services.VisitService;

/**
 * @author Madhu
 *
 */
public class VisitSDJPAServiceImpl implements VisitService {
	
	private final VisitRepository visitRepo;
	
	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<Visit>();
		visitRepo.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepo.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit visit) {
		return visitRepo.save(visit);
	}

	@Override
	public void delete(Visit visit) {
		visitRepo.delete(visit);
	}

	@Override
	public void deleteById(Long id) {
		visitRepo.deleteById(id);
	}

	/**
	 * @param visitRepo
	 */
	@Autowired
	public VisitSDJPAServiceImpl(VisitRepository visitRepo) {
		super();
		this.visitRepo = visitRepo;
	}

}
