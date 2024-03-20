package com.fdmgroup.icode.physical.exercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.physical.model.Exercise;

@Repository
public class ExerciseRepository {
	
	private List<Exercise> exercises;

	public ExerciseRepository(@Qualifier("exercises") List<Exercise> exercises) {
		super();
		this.exercises = exercises;
	}
	
	public List<Exercise> findAllExercises(){
		return this.exercises;
	}

	
}
