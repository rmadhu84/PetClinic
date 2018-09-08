/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Set;

import com.springframework.PetClinic.Model.Visit;
import com.springframework.PetClinic.services.VisitService;

/**
 * @author Madhu
 *
 */
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
				|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit entity");
		}else 
			return super.save(visit);
	}

	@Override
	public void delete(Visit visit) {
		super.delete(visit);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
