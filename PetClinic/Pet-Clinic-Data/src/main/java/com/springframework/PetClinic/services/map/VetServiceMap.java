/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.services.SpecialityService;
import com.springframework.PetClinic.services.VetService;

/**
 * @author Madhu
 *
 */
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	private final SpecialityService specialityService;
	
	
	
	/**
	 * @param specialityService
	 */
	@Autowired
	public VetServiceMap(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	/** (non-Javadoc)
	 * @see com.springframework.PetClinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Vet save(Vet vet) {
//		return super.save(vet.getId(), vet);
		
		if(vet != null) {
			if(vet.getSpecialties()!=null) {
				vet.getSpecialties().forEach(speciality ->{
					if(speciality.getId()==null) {
						speciality.setId(specialityService.save(speciality).getId());
					}
				});
				
			}else {
				throw new RuntimeException("Vet must have a speciality");
			}
			
			return super.save(vet);
		}else
			return null;
		
		
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
