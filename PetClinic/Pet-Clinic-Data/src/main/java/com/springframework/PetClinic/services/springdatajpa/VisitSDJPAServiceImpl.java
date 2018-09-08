/**
 * 
 */
package com.springframework.PetClinic.services.springdatajpa;

import java.util.Set;

import com.springframework.PetClinic.Model.Visit;
import com.springframework.PetClinic.Repositories.VisitRepository;
import com.springframework.PetClinic.services.VisitService;

/**
 * @author Madhu
 *
 */
public class VisitSDJPAServiceImpl implements VisitService {
	
	private final VisitRepository visit;
	
	@Override
	public Set<Visit> findAll() {
		return null;
	}

	@Override
	public Visit findById(Long id) {
		return null;
	}

	@Override
	public Visit save(Visit object) {
		return null;
	}

	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteById(Long id) {

	}

}
