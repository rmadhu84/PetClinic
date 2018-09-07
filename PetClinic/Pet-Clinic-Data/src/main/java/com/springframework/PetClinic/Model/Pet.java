/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Entity
@Table(name="pets")
public class Pet extends BaseEntity{
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name ="type_id")
	private PetType petType;

	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> vists = new HashSet<>();
}
