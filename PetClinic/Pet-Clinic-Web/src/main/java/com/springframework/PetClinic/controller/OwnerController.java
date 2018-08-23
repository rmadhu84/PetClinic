/**
 * 
 */
package com.springframework.PetClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.PetClinic.Model.Owner;
import com.springframework.PetClinic.services.OwnerService;

/**
 * @author ramachandranm1
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	private OwnerService ownerService;
	
	
	/**
	 * @param ownerService
	 */
	@Autowired
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/", "/index", "/index.html"})
	public String listOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
