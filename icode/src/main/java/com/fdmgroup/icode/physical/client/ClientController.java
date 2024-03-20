package com.fdmgroup.icode.physical.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("client")
public class ClientController {
	
	private String baseFolder = "physical/client";
	private ClientLoginService loginService;
	private ClientService service;
	
	public ClientController(ClientLoginService loginService, ClientService service) {
		super();
		this.loginService = loginService;
		this.service = service;
	}
	
	@GetMapping("/login")
	public String goToLoginPage() {
		return baseFolder + "/login";
	}
	
	@PostMapping("/login")
	public String processClientLogin() {
		//TODO
		return baseFolder + "/login";
	}
	
	//TODO -- logout 

	//TODO -- view list of assignments
	
	//TODO -- view Physical therapist information
	
	//TODO -- update contact information
	
}
