package com.fdmgroup.icode.library.user;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class User {
	
		private Long cardNumber;
	    private String name;
		private String email;
	    private String patronCategory;
	    private String gender;
	    private String password;
	    
	    private static Set<Long> usedCardNumbers = new HashSet<>();
	    
	    public User() {
	    	this.setCardNumber(generateUniqueCardNumber());
	    	
	    }
	    
		public User(String name, String patronCategory, String gender, String password, String email) {
			this();
			this.name = name;
			this.patronCategory = patronCategory;
			this.gender = gender;
			this.password = password;
			this.email = email;
		}

	    

		private Long generateUniqueCardNumber() {	
	        Random random = new Random();
	        Long newCardNumber;
	        do {
	            newCardNumber = 100000000L + (long) (random.nextFloat() * 900000000L);
	        } while (usedCardNumbers.contains(newCardNumber));
	        
	        usedCardNumbers.add(newCardNumber);
	        return newCardNumber;

		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPatronCategory() {
			return patronCategory;
		}

		public void setPatronCategory(String patronCategory) {
			this.patronCategory = patronCategory;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
	    
		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		
		public Long getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(Long cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	    




}
