/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * @author RamachandranM1
 *
 */
@Getter
@Setter
public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5650276671164641942L;
	
	private Set<Specialty> specialties;

}
