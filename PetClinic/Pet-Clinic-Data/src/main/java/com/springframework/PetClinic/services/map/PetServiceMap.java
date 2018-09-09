/**
 * 
 */
package com.springframework.PetClinic.services.map;


import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Pet;
import com.springframework.PetClinic.services.PetService;

/**
 * @author Madhu
 *
 */
@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	/**
	 * Implementing CrudService method findById(Long)
	 */
	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/**
	 * Implementing CrudService method save(Owner)
	 */
	@Override
	public Pet save(Pet pet) {
		// TODO Auto-generated method stub
//		return super.save(pet.getId(), pet);
		return super.save(pet);
	}
	
	/**
	 * Implementing CrudService method findAll()
	 */
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	/**
	 * Implementing CrudService method delete(Owner)
	 */
	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}
	
	/**
	 * Implementing CrudService method deleteById(Long)
	 */
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
