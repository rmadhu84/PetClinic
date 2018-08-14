/**
 * 
 */
package com.springframework.PetClinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ramachandranm1
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"","/", "/index", "/index.html"})
	public String listOwners() {
		return "owners/index";
	}
}
