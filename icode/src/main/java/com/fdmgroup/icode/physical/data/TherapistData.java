package com.fdmgroup.icode.physical.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.icode.physical.model.Client;
import com.fdmgroup.icode.physical.model.ContactInfo;
import com.fdmgroup.icode.physical.model.Therapist;

@Configuration
public class TherapistData {
	
	@Bean("therapist1")
	public Therapist getTherapist1(@Qualifier("ci_therapist1") ContactInfo contact,
			@Qualifier("client1")Client client1,
			@Qualifier("client2")Client client2) {
		Therapist therapist = new Therapist();
		therapist.setUsername("ashley.smith");
		therapist.setPassword("123test");
		therapist.setContactInformation(contact);
		therapist.setClients(new ArrayList<>(Arrays.asList(client1, client2)));
		return therapist;
	}
	
	@Bean("therapist2")
	public Therapist getTherapist2(@Qualifier("ci_therapist2") ContactInfo contact,
			@Qualifier("client3") Client client) {
		Therapist therapist = new Therapist();
		therapist.setUsername("blake.arnold");
		therapist.setPassword("passcode123");
		therapist.setContactInformation(contact);
		therapist.setClients(new ArrayList<>(Arrays.asList(client)));
		return therapist;
	}
	
	@Bean("therapists")
	public List<Therapist> getTherapists(@Qualifier("therapist1") Therapist therapist1,
			@Qualifier("therapist2") Therapist therapist2){
		return new ArrayList<>(Arrays.asList(therapist1, therapist2));
	}

}
