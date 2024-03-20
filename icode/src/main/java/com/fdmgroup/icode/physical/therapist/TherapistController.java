package com.fdmgroup.icode.physical.therapist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("therapist")
public class TherapistController {
	
	private String baseFolder = "physical/therapist";
	private TherapistLoginService loginService;
	private TherapistService service;
	
	public TherapistController(TherapistLoginService loginService, TherapistService service) {
		super();
		this.loginService = loginService;
		this.service = service;
	}

	@GetMapping("/login")
	public String goToLoginPage() {
		return baseFolder + "/login";
	}

	@PostMapping("/login")
	public String processTherapistLogin() {
		// TODO
		return baseFolder + "/home";
	}
	
	//TODO - logout
	
	//TODO - view clients
	
	//TODO - other client tasks
	
	//TODO redirect to method in Exercises controller
}
