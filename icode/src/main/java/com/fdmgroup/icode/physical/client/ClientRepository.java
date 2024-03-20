package com.fdmgroup.icode.physical.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.physical.model.Client;

@Repository
public class ClientRepository {

	private List<Client> clients;

	public ClientRepository(@Qualifier("all-clients")List<Client> clients) {
		super();
		this.clients = clients;
	}
	
	
}
