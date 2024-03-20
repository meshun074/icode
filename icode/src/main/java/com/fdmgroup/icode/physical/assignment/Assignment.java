package com.fdmgroup.icode.physical.assignment;

import java.util.List;

import com.fdmgroup.icode.physical.model.Workout;

public class Assignment {

	private int expectedTimesCompleted;
	private int timesCompleted = 0;
	private List<Workout> workouts;
	
	public Assignment() {
		super();
	}
	
	public Assignment(int expectedTimesCompleted, List<Workout> workouts) {
		super();
		this.expectedTimesCompleted = expectedTimesCompleted;
		this.workouts = workouts;
	}

	public int getTimesCompleted() {
		return timesCompleted;
	}
	public void setTimesCompleted(int timesCompleted) {
		this.timesCompleted = timesCompleted;
	}
	
	public int getExpectedTimesCompleted() {
		return expectedTimesCompleted;
	}

	public void setExpectedTimesCompleted(int expectedTimesCompleted) {
		this.expectedTimesCompleted = expectedTimesCompleted;
	}

	public List<Workout> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}
	
}
