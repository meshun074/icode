package com.fdmgroup.icode.image.upload.util;

public class UniqueImageId {
	
	private static double id = Math.random();
	
	public static double getNextNumber() {
		return id++;
	}

}
