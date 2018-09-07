/**
 * 
 */
package com.springframework.PetClinic.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.PetClinic.Model.Owner;

/**
 * @author Madhu
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
	Owner findByLastName(String lastName);
}
