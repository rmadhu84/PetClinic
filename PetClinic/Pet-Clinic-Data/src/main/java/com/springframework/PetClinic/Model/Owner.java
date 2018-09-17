/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author RamachandranM1
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity(name="owners")
public class Owner extends Person {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7684297130966446439L;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="owner", fetch=FetchType.EAGER)
	private Set<Pet> pets = new HashSet<Pet>();
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="telephone")
	private String telephone;

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param pets
	 * @param address
	 * @param city
	 * @param telephone
	 */
	 /* comments: Used explicit constructor instead of @AllArgsContructor, 
	 *            in order for the Builder pattern to be able to access the inherited Super class properties.
	 */
	@Builder
	public Owner(Long id, String firstName, String lastName, Set<Pet> pets, String address, String city,
			String telephone) {
		super(id, firstName, lastName);
		this.pets = pets;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}
	
	
}
