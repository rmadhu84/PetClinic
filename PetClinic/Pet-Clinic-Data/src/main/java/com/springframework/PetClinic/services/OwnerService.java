/**
 * 
 */
package com.springframework.PetClinic.services;

import com.springframework.PetClinic.Model.Owner;

/**
 * @author ramachandranm1
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
}
