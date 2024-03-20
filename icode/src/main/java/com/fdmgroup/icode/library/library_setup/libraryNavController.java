package com.fdmgroup.icode.library.library_setup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/library")
public class libraryNavController {
	

	@GetMapping("/locations/locationHome")
	public String goToLibraryLocations() {
		return "/library/locations/locationHome";
	}
	
	@GetMapping("/getCard")
	public String goToGetACard(){
		return "/library/usersFeature/getCard";
	}
	
	@GetMapping("/donate")
	public String getMethodName() {
		return "/library/donate/donateHome";
	}
	
	@GetMapping("/donate/donateHome")
	public String goToDonate(){
		return "/library/donate/donateHome";
	}
	
	
	@GetMapping("/booksFeature/booksHome")
	public String goToBooksFeatureHome(){
		return "/library/booksFeature/booksHome";
	}
	
	@GetMapping("/music/musicHome")
	public String goToMusic(){
		return "/library/music/musicHome";
	}
	
	@GetMapping("/movies/movieHome")
	public String goToMovies(){
		return "/library/movies/movieHome";
	}
	
	
	@GetMapping("/events/eventHome")
	public String goToEvents(){
		return "/library/events/eventHome";
	}
	
	@GetMapping("/register")
	public String goToRegister(){
		return "/library/usersFeature/register";
	}
	
	@GetMapping("/loginForm")
	public String goToLogin(){
		return "/library/usersFeature/login";
	}
	


}
