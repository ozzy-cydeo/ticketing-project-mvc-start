package com.cybertek.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping
	public String login(Model model) {

		return "login";
	}

	@GetMapping("/welcome")
	public String welcome(Model model) {

		return "welcome";
	}
}
