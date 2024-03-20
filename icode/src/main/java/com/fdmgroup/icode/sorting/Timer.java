package com.fdmgroup.icode.sorting;

import java.time.LocalTime;

public class Timer {

	private LocalTime startTime;
	private LocalTime endTime;
	
	public void startTimer() {
		startTime = LocalTime.now();
	}
	
	public void stopTimer() {
		endTime = LocalTime.now();
	}
	
	public double getSeconds() {
		int differenceInSeconds = endTime.minusSeconds(startTime.getSecond()).getSecond();
		int differenceInNano = endTime.minusNanos(startTime.getNano()).getNano();
		String time = differenceInSeconds + "." + differenceInNano;
		return Double.parseDouble(time);
	}
}
