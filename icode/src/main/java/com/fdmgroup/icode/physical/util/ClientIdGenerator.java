package com.fdmgroup.icode.physical.util;

public class ClientIdGenerator {

	private static long id = 4_000;
	
	public static long getId() {
		return ++id;
	}
}
