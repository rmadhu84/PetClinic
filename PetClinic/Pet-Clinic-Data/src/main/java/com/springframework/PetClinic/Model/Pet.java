/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.time.LocalDate;

import javax.security.auth.callback.LanguageCallback;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author RamachandranM1
 *
 */
@Getter
@Setter
public class Pet extends BaseEntity{
	private String name;
	private PetType petType;
	private LocalDate birthDate;
}
