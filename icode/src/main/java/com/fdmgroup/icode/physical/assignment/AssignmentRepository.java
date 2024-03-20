package com.fdmgroup.icode.physical.assignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.physical.model.Client;
import com.fdmgroup.icode.physical.model.Therapist;

@Repository
public class AssignmentRepository {
	
	private List<Therapist> therapists;

	public AssignmentRepository(@Qualifier("therapists") List<Therapist> therapists) {
		super();
		this.therapists = therapists;
	}

	public List<Client> findAllClientsWithAssignments() {
		List<Client> clients = new ArrayList<>();
		for(Therapist therapist : therapists) {
			if(therapist.getClients() != null) {
				for(Client client : therapist.getClients()) {
					if(client.getAssignments() != null && !client.getAssignments().isEmpty()) {
						clients.add(client);
					}
				}
			}
		}
		return clients;
	}
	
	public List<Assignment> findAssignmentsByClientId(int clientId){
		// TODO
		return null;
	}

}
