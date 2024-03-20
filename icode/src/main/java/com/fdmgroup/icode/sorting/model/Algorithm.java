package com.fdmgroup.icode.sorting.model;

public class Algorithm {
	
	private String name;
	private double time;
	private boolean isCompleted;
	
	public Algorithm(String name) {
		super();
		this.name = name;
		this.time = 0.0;
		this.isCompleted = false;
	}

	public String getName() {
		return name;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "Algorithm [name=" + name + ", time=" + time + ", isCompleted=" + isCompleted + "]";
	}
}
