/**
 * 
 */
package com.springframework.PetClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.services.VetService;

/**
 * @author ramachandranm1
 *
 */
@Controller
public class VetController {

	private VetService vetService;
	
	
	
	/**
	 * @param vetService
	 */
	@Autowired
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
