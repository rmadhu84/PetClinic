/**
 * 
 */
package com.springframework.PetClinic.services;

import java.util.Set;

import com.springframework.PetClinic.Model.Owner;

/**
 * @author ramachandranm1
 *
 */
public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
