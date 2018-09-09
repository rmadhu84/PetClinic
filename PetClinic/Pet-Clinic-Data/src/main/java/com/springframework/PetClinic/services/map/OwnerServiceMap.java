/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Owner;
import com.springframework.PetClinic.services.OwnerService;
import com.springframework.PetClinic.services.PetService;
import com.springframework.PetClinic.services.PetTypeService;

/**
 * @author Madhu
 *
 */
@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private PetTypeService petTypeService;
	private PetService petService;
	
	
	/**
	 * @param petTypeService
	 * @param petService
	 */
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

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
	//	return super.save(owner.getId(), owner);
		if (owner != null) {
			if(owner.getPets() != null) {
				owner.getPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet Type is required");
					}
					if(pet.getId() == null) {
						pet.setId(petService.save(pet).getId());
					}
				});
			}
			return super.save(owner);
		}else
			return null;
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

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
