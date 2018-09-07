/**
 * 
 */
package com.springframework.PetClinic.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.PetClinic.Model.PetType;

/**
 * @author Madhu
 *
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
