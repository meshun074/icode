package com.fdmgroup.icode.physical.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.physical.assignment.Assignment;
import com.fdmgroup.icode.physical.model.Client;

@Service
public class ClientService {
	
	private Client currentClient;
	private ClientRepository repo;
	
	public ClientService(ClientRepository repo) {
		super();
		this.repo = repo;
	}

	public Client getCurrentClient() {
		return currentClient;
	}
	
	public void setCurrentClient(Client currentClient) {
		this.currentClient = currentClient;
	}

	public List<Assignment> getCurrentAssignment(){
		// TODO
		return null;
	}

	// TODO -- get PT information
	
	// TODO -- update client contact information
	
	// TODO -- validate email before updating 
}
