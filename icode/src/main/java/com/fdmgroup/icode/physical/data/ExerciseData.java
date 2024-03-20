package com.fdmgroup.icode.physical.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.icode.physical.model.BodyPart;
import com.fdmgroup.icode.physical.model.Exercise;
import com.fdmgroup.icode.physical.util.ExerciseIdGenerator;

@Configuration
public class ExerciseData {
	
	@Bean("exercises")
	public List<Exercise> starterExercises(){
		Exercise exercise1 = new Exercise(ExerciseIdGenerator.getId()
				, "Push ups", 
				BodyPart.CHEST,
				"https://www.youtube.com/watch?v=bt5b9x9N0KU", 
				"You will be on the floor for this exercise. You want your stomach facing the ground. "
				+ "Your body will be straight. The starting position will have your arms straight, hands under your shoulders."
				+ "You will lower your body to the ground until your arms are bent 90 degrees, then your will return to the straight position.");
		Exercise exercise2 = new Exercise(ExerciseIdGenerator.getId()
				, "Forward Lunges", 
				BodyPart.LEGS,
				"https://www.youtube.com/watch?v=AC_ZfZcVu9Q", 
				"This exercise, you will start in the standing position, feet together."
				+ "With one foot you will step forward, then you will lower yourself to the floor bending both legs."
				+" Careful to not let your front knee cross your front toes. After you reach 90 degrees, press back to straight legs, return to both legs together and repeat on the other side.");
		Exercise exercise3 = new Exercise(ExerciseIdGenerator.getId()
				, "Seated Toe Taps", 
				BodyPart.FOOT_ANKLE,
				"https://www.youtube.com/watch?v=T4uJ4DXQy04", 
				"You will be seated on a chair for this exercise. You will start with your feet flat on the ground, knees 90 degrees." +
				"You will lift your toes to the sky, pivoting on your heals which will remain on the ground. Then you will lower your toes back to the ground.");
		return new ArrayList<>(Arrays.asList(exercise1, exercise2, exercise3));
	}

}
