/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * @author RamachandranM1
 *
 */
@Getter
@Setter
@Entity(name="owners")
public class Owner extends Person {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7684297130966446439L;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="owner")
	private Set<Pet> pets = new HashSet<Pet>();
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="telephone")
	private String telephone;
}
