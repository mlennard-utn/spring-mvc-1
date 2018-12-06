package com.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		/* ... */ 
		model.addAttribute("messageHola", "Hola mundo cruel!");
		return "hola-mundo";
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile(Model model) {
		/* ... */ 
		return "";
	}
	
	@RequestMapping(value = "/user" )
	public String newUser(Model model){
	  model.addAttribute("user", new User());
	  return "userForm";
	}
	
	@RequestMapping(value = "/addUser", method=RequestMethod.POST)
	public String addUser(Model model) {
		
		return "userForm";
	}

}