package com.fdmgroup.icode.planner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planner")
public class PlannerController {

	@GetMapping("/landing")
	public String goToLangingPage() {
		return "planner/landing";
	}
	
	@GetMapping("/home")
	public String goToHomePage() {
		return "planner/home";
	}

}

