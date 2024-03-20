package com.fdmgroup.icode.setup.toggle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/physical")
public class PhysicalTherapyToggleController {

	private PhysicalTherapyToggleService toggleService;
	private String landing = "redirect:/physical/landing";
		
	public PhysicalTherapyToggleController(PhysicalTherapyToggleService toggleService) {
		super();
		this.toggleService = toggleService;
	}

	@GetMapping("/setup")
	public String setUpSession() {
		toggleService.setVariables();
		return landing;
	}
	
	@GetMapping("/landing")
	public String goToLandingPage() {
		return "physical/landing";
	}
	
	@GetMapping("/physical1")
	public String togglePhysicalTherapist() {
		toggleService.togglePhysicalTherapist();
		return landing;
	}
	
	@GetMapping("/physical2")
	public String togglePhysicalTherapyClient() {
		toggleService.togglePhysicalTherapyClient();
		return landing;
	}
	
	@GetMapping("/physical3")
	public String toggleExercises() {
		toggleService.toggleExercises();
		return landing;
	}
	
	@GetMapping("/physical4")
	public String toggleAssignments() {
		toggleService.toggleAssignments();
		return landing;
	}
	
}
