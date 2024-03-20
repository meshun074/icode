package com.fdmgroup.icode.physical.exercise;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.physical.model.Exercise;

@Controller
@RequestMapping("/exercises")
public class ExerciseController {
	
	private String baseFolder = "physical/exercises";
	private ExerciseService exerciseService;
	
	public ExerciseController(ExerciseService exerciseService) {
		super();
		this.exerciseService = exerciseService;
	}

	@GetMapping()
	public String goToExerciseList(Model model) {
		List<Exercise> exercises = exerciseService.getAllExercises();
		model.addAttribute("exercises", exercises);
		return baseFolder + "/list";
	}
	
	@GetMapping("/create")
	public String goToCreateNewExercise() {
		//TODO
		return baseFolder + "/create-exercise";
	}

}
