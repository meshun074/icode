package com.fdmgroup.icode.physical.model;

public class Workout{
	
	private Exercise exercise;
	private int reps;
	private int sets;
	private boolean isCompleted;
	
	public Workout() {
		
	}
	
	public Workout(Exercise exercise, int reps, int sets) {
		super();
		this.exercise = exercise;
		this.reps = reps;
		this.sets = sets;
		this.isCompleted = false;
	}
	
	public Workout(Exercise exercise, int reps, int sets, boolean isCompleted) {
		super();
		this.exercise = exercise;
		this.reps = reps;
		this.sets = sets;
		this.isCompleted = isCompleted;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

}
