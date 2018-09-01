package com.neckcompany.neck.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class MainController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String freeBoardList(ModelMap model) {
		
		model.addAttribute("welcomeStr", "Thanks for visiting today!");
		return "home";
	}
}
