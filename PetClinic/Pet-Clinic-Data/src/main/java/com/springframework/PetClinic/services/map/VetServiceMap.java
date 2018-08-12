/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Set;

import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.services.CrudService;

/**
 * @author Madhu
 *
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Vet save(Vet vet) {
		// TODO Auto-generated method stub
		return super.save(vet.getId(), vet);
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Vet vet) {
		// TODO Auto-generated method stub
		super.delete(vet);
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
	
	
}
