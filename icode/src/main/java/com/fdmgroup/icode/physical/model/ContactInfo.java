package com.fdmgroup.icode.physical.model;

import java.util.Objects;

public class ContactInfo {

	private String firstName;
	private String lastName;
	private String number;
	private String email;
	
	public ContactInfo() {
		
	}
	
	public ContactInfo(String firstName, String lastName, String number, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, lastName, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactInfo other = (ContactInfo) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "ContactInfo [firstName=" + firstName + ", lastName=" + lastName + ", number=" + number + ", email="
				+ email + "]";
	}
	
	
}
