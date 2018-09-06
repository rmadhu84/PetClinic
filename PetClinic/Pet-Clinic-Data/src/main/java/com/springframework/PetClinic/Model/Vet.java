/**
 * 
 */
package com.springframework.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.springframework.PetClinic.services.SpecialityService;

import lombok.Getter;
import lombok.Setter;

/**
 * @author RamachandranM1
 *
 */
@Getter
@Setter
@Entity
@Table(name="vets")
public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5650276671164641942L;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name ="vets_specialities", joinColumns = @JoinColumn(name="speciality_id"), inverseJoinColumns=@JoinColumn(name="vet_id") )
	private Set<Speciality> specialties = new HashSet<Speciality>();
	
}
