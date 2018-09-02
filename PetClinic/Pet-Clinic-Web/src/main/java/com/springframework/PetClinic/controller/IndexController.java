/**
 * 
 */
package com.springframework.PetClinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ramachandranm1
 *
 */

@Controller
public class IndexController {

	@RequestMapping({"", "/", "index", "index.html"})
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/oups")
	public String oupsHandler() {
		return "NotImplemented";
	}
}
