/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.PetType;
import com.springframework.PetClinic.services.PetTypeService;

/**
 * @author Madhu
 *
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

	/* (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#findAll()
	 */
	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	/* (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public PetType save(PetType petType) {
		// TODO Auto-generated method stub
		return super.save(petType);
	}

	/* (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(PetType petType) {
		// TODO Auto-generated method stub
		super.delete(petType);

	}

	/* (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);

	}

}
