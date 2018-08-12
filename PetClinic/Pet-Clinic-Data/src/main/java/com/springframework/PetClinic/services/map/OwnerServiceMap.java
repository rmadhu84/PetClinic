/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Set;

import com.springframework.PetClinic.Model.Owner;
import com.springframework.PetClinic.services.CrudService;

/**
 * @author Madhu
 *
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	/**
	 * Implementing CrudService method findById(Long)
	 */
	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/**
	 * Implementing CrudService method save(Owner)
	 */
	@Override
	public Owner save(Owner owner) {
		// TODO Auto-generated method stub
		return super.save(owner.getId(), owner);
	}
	
	/**
	 * Implementing CrudService method findAll()
	 */
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	/**
	 * Implementing CrudService method delete(Owner)
	 */
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}
	
	/**
	 * Implementing CrudService method deleteById(Long)
	 */
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}
