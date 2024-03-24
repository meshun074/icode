package com.fdmgroup.icode.physical.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.icode.physical.assignment.Assignment;
import com.fdmgroup.icode.physical.model.Exercise;
import com.fdmgroup.icode.physical.model.Workout;

@Configuration
public class AssignmentData {
	
	@Bean("workout1")
	public Workout workout1(@Qualifier("exercises")List<Exercise> exercises) {
		Workout workout1 = new Workout(exercises.get(0), 6, 3);
		return workout1;
	}
	
	@Bean("workout2")
	public Workout workout2(@Qualifier("exercises") List<Exercise> exercises) {
		Workout workout1 = new Workout(exercises.get(1), 6, 3);
		return workout1;
	}

	@Bean("assignment1")
	public Assignment assignment1(@Qualifier("workout1") Workout workout) {
		List<Workout> workouts = new ArrayList<>(Arrays.asList(workout));
		Assignment assignment = new Assignment();
		assignment.setExpectedTimesCompleted(3);
		assignment.setWorkouts(workouts);
		return assignment;
	}
	
	@Bean("assignment2")
	public Assignment assignment2(@Qualifier("workout1") Workout workout, @Qualifier("workout2") Workout workout2) {
		List<Workout> workouts = new ArrayList<>(Arrays.asList(workout, workout2));
		Assignment assignment = new Assignment();
		assignment.setExpectedTimesCompleted(4);
		assignment.setWorkouts(workouts);
		return assignment;
	}
}
