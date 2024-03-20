package com.fdmgroup.icode.recipes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipes")


public class RecipesController {
	

	//RecipesService object should be injected 
	//Each method must call the service method to implement functionality
	
	// Also need to make model classes with meaningful attributes 

	
	@GetMapping("/getAll")
	public String getAllRecipes() {
		return "recipes/getAll";
	}
	
	@GetMapping("/get")
	public String getRecipe() {
		return "recipes/get";
	}
	
	@GetMapping("/add")
	public String addRecipe() {
		return "recipes/add";
	}
	
	@GetMapping("/update")
	public String toChangeCasePage() {
		return "recipes/update";
	}

}
