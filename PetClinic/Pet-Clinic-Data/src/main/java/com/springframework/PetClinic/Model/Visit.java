package com.springframework.PetClinic.Model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Visit extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7510853318612568878L;
	private LocalDate date;
	private String description;
	private Pet Pet;
}
