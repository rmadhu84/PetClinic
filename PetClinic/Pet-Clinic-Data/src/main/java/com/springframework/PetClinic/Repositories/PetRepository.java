/**
 * 
 */
package com.springframework.PetClinic.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.PetClinic.Model.Pet;

/**
 * @author Madhu
 *
 */
public interface PetRepository  extends CrudRepository<Pet, Long>{

}
