package com.fdmgroup.icode.physical.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.icode.physical.assignment.Assignment;
import com.fdmgroup.icode.physical.model.Client;
import com.fdmgroup.icode.physical.model.ContactInfo;
import com.fdmgroup.icode.physical.util.ClientIdGenerator;

@Configuration
public class ClientData {
	
	
	@Bean("client1")
	public Client getClient1(@Qualifier("assignment1")Assignment assignment,
			@Qualifier("ci_client1") ContactInfo clientContact, 
			@Qualifier("ci_therapist1") ContactInfo therapistContact) {
		Client client = new Client();
		client.setId(ClientIdGenerator.getId());
		client.setActive(true);
		client.setAssignments(new ArrayList<>(Arrays.asList(assignment)));
		client.setUsername("anne123");
		client.setPassword("123fake");
		client.setContactInformation(clientContact);
		client.setTherapistInformation(therapistContact);
		return client;
	}

	@Bean("client2")
	public Client getClient2(@Qualifier("assignment1")Assignment assignment, 
			@Qualifier("assignment2")Assignment assignment2,
			@Qualifier("ci_client2") ContactInfo clientContact, 
			@Qualifier("ci_therapist1") ContactInfo therapistContact) {
		Client client = new Client();
		client.setId(ClientIdGenerator.getId());
		client.setActive(true);
		client.setAssignments(new ArrayList<>(Arrays.asList(assignment, assignment2)));
		client.setUsername("john234");
		client.setPassword("test");
		client.setContactInformation(clientContact);
		client.setTherapistInformation(therapistContact);
		return client;
	}
	
	@Bean("client3")
	public Client getClient3(
			@Qualifier("ci_client3") ContactInfo clientContact, 
			@Qualifier("ci_therapist2") ContactInfo therapistContact) {
		Client client = new Client();
		client.setId(ClientIdGenerator.getId());
		client.setActive(false);
		client.setUsername("sammuel432");
		client.setPassword("happy");
		client.setContactInformation(clientContact);
		client.setTherapistInformation(therapistContact);
		return client;
	}
	
	@Bean("all-clients")
	public List<Client> getAllClients(
			@Qualifier("client1") Client client1,
			@Qualifier("client2") Client client2,
			@Qualifier("client3") Client client3){
		return new ArrayList<>(Arrays.asList(client1, client2, client3));
	}
}
