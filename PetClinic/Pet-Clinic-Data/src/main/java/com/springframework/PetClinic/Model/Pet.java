/**
 * 
 */
package com.springframework.PetClinic.Model;

import lombok.Data;

/**
 * @author RamachandranM1
 *
 */
@Data
public class Pet extends BaseEntity{
	private String name;
	private PetType petType;
}
