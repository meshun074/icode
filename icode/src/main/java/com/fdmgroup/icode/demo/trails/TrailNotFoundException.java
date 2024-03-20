package com.fdmgroup.icode.demo.trails;

public class TrailNotFoundException extends Exception{

	public TrailNotFoundException(int trailId) {
		super("Trail with id: " + trailId + "was not found");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
