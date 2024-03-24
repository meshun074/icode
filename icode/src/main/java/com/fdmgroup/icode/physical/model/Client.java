package com.fdmgroup.icode.physical.model;

import java.util.List;

import com.fdmgroup.icode.physical.assignment.Assignment;

public class Client extends User{
	
	private long id;
	private ContactInfo contactInformation;
	private ContactInfo therapistInformation;
	private boolean isActive;
	private List<Assignment> assignments;
	
	public Client() {
		
	}

	public Client(String username, String password) {
		super(username, password);
		isActive = true;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ContactInfo getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInfo contactInformation) {
		this.contactInformation = contactInformation;
	}

	public ContactInfo getTherapistInformation() {
		return therapistInformation;
	}

	public void setTherapistInformation(ContactInfo therapistInformation) {
		this.therapistInformation = therapistInformation;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

}
