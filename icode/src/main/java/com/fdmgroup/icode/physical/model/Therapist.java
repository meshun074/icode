package com.fdmgroup.icode.physical.model;

import java.util.List;

public class Therapist extends User{
	
	private ContactInfo contactInformation;
	private List<Client> clients;
	
	public Therapist() {
		super();
	}

	public Therapist(String username, String password) {
		super(username, password);
	}

	public ContactInfo getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInfo contactInformation) {
		this.contactInformation = contactInformation;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
}
