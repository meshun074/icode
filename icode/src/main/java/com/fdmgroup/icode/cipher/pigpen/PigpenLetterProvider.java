package com.fdmgroup.icode.cipher.pigpen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigpenLetterProvider {
	
	private static List<Letter> letters = 
			new ArrayList<>(Arrays.asList(
					new Letter("a","/cipher/pigpen/a.png"), 
					new Letter("b","/cipher/pigpen/b.png"),
					new Letter("c","/cipher/pigpen/c.png"),
					new Letter("d","/cipher/pigpen/d.png"),
					new Letter("e","/cipher/pigpen/e.png"),
					new Letter("f","/cipher/pigpen/f.png"),
					new Letter("g","/cipher/pigpen/g.png")));
	
	public static List<Letter> getLetters(){
		return letters;
	}
	
	public static String findImage(String letterToSearch) {
		for(Letter letter : letters) {
			if(letter.getLetter().equals(letterToSearch)) {
				return letter.getImage();
			}
		}
		return "";
	}

}
