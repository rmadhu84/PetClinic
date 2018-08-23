/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Madhu
 *
 */
@Getter
@Setter
public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -1957837592305842857L;
	private Long id;
	
	
	
	
}
