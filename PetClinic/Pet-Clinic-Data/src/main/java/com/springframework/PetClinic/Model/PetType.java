package com.springframework.PetClinic.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetType extends BaseEntity {

	private String name;
}
