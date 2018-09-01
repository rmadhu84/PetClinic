/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * @author RamachandranM1
 *
 */
@Getter
@Setter
public class Owner extends Person {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7684297130966446439L;
	private Set<Pet> pets = new HashSet<Pet>();
	
	private String address;
	private String city;
	private String telephone;
}
