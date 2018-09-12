/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Madhu
 *
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -1957837592305842857L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	/**
	 * @param id
	 */
	 /* comments: Used explicit constructor instead of @AllArgsContructor, 
	 *            in order for the Builder pattern to be able to access the inherited Super class properties.
	 */
	public BaseEntity(Long id) {
		super();
		this.id = id;
	}
	
	
	
	
}
