package com.fdmgroup.icode.demo.trails;

public class TrailIdGenerator {
	
	private static int nextAvailableId = 1;
	
	public static int getId() {
		return nextAvailableId++;
	}

}
