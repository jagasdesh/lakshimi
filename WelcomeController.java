package com.demos.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
@RequestMapping(value="/welcome")
public String getMessage(Model model) {
	
	model.addAttribute("message","Welcome to the world of spring mvc!");
	return "welcome";
}
}
