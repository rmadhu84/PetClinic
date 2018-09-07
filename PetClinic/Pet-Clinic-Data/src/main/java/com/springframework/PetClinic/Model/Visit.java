package com.springframework.PetClinic.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="visits")
public class Visit extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7510853318612568878L;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="pet_id")
	private Pet Pet;
}
