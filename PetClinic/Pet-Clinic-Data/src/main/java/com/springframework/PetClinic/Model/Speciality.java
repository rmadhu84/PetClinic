/**
 * 
 */
package com.springframework.PetClinic.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Madhu
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="specialties")
public class Speciality extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4151958366876054271L;
	
	@Column(name="description")
	private String description;
}
