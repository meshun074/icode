package com.fdmgroup.icode.physical.exercise;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.physical.model.Exercise;

@Service
public class ExerciseService {
	
	private ExerciseRepository exerciseRepo;

	public ExerciseService(ExerciseRepository exerciseRepo) {
		super();
		this.exerciseRepo = exerciseRepo;
	}
	
	public List<Exercise> getAllExercises(){
		return this.exerciseRepo.findAllExercises();
	}

}
