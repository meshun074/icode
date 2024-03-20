package com.fdmgroup.icode.setup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/")
	public String goToHomePage() {
		return "home";
	}
	
	@GetMapping("demo")
	public String goToDemoPage() {
		return "forward:/toggle/setup";
	}
	
	@GetMapping("converter")
	public String goToMetricsPage(){
		return "metrics/landing";
	}
	
	@GetMapping("string-changer")
	public String goToStringPage(){
		return "string-changer/landing";
	}
	
	@GetMapping("library")
	public String goToLibraryPage(){
		return "library/landing";
	}
	
	@GetMapping("e-shopping")
	public String goToShoppingPage(){
		return "e-shopping/landing";
	}
	
	@GetMapping("image-filter")
	public String goToImageFilterPage(){
		return "forward:/it/main";
	}
	
	@GetMapping("sorting")
	public String goToSortingShenanigansPage() {
		return "forward:/st/main";
	}
	
	@GetMapping("cipher")
	public String goToCipherPage(){
		return "forward:/ct/main";
	}
	
	@GetMapping("recipes")
	public String goToRecipesPage(){
		return "recipes/landing";
	}
	
	@GetMapping("planner")
	public String goToPlannerPage(){
		return "forward:/pt/main";
	}
	
	@GetMapping("physical")
	public String goToPhysicalTherapyPage(){
		return "forward:/physical/setup";
	}
	
}
