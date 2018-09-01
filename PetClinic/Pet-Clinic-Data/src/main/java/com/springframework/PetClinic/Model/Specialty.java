/**
 * 
 */
package com.springframework.PetClinic.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Madhu
 *
 */
@Getter
@Setter
public class Specialty extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4151958366876054271L;
	private String description;
}
