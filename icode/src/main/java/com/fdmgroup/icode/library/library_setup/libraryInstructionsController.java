package com.fdmgroup.icode.library.library_setup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class libraryInstructionsController {
	

	@GetMapping("/library/instructions/locations")
	public String goToLibraryLocations() {
		return "library/instructions/locations";
	}
	
	@GetMapping("/library/instructions/getCard")
	public String goToGetACard(){
		return "library/instructions/getCard";
	}
	
	
	@GetMapping("/library/instructions/donate")
	public String goToDonate(){
		return "library/instructions/donate";
	}
	
	
	@GetMapping("/library/instructions/booksFeatureInstructions")
	public String goToBooks(){
		return "library/instructions/booksFeatureInstructions";
	}
	
	@GetMapping("/library/instructions/music")
	public String goToMusic(){
		return "library/instructions/music";
	}
	
	@GetMapping("/library/instructions/movies")
	public String goToMovies(){
		return "library/instructions/movies";
	}
	
	
	@GetMapping("/library/instructions/events")
	public String goToEvents(){
		return "library/instructions/events";
	}
	
	@GetMapping("/library/instructions/register")
	public String goToRegister(){
		return "library/instructions/register";
	}
	
	@GetMapping("/library/instructions/login")
	public String goToLogin(){
		return "library/instructions/login";
	}
	


}
