/**
 * 
 */
package com.springframework.PetClinic.controller;

import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ramachandranm1
 *
 */
@Controller
public class VetController {

	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets() {
		return "vets/index";
	}
}
