package com.springframework.PetClinic.Model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	 /* comments: Used explicit constructor instead of @AllArgsContructor, 
	 *            in order for the Builder pattern to be able to access the inherited Super class properties.
	 */
	public Person(Long id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	
}
