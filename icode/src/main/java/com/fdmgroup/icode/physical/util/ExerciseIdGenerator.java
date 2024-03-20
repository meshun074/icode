package com.fdmgroup.icode.physical.util;

public class ExerciseIdGenerator {
	
	private static long id = 0;
	
	public static long getId() {
		return ++id;
	}

}
