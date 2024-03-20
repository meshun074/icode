package com.fdmgroup.icode.physical.assignment;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.physical.model.Client;

@Service
public class AssignmentService {
	
	private AssignmentRepository repo;

	public AssignmentService(AssignmentRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Client> findClientsWithAssignments() {
		return repo.findAllClientsWithAssignments();
	}
	
	public List<Assignment> findAssignmentsByClientId(int clientId){
		// TODO
		return null;
	}

}
