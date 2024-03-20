package com.fdmgroup.icode.physical.client;

import org.springframework.stereotype.Service;

@Service
public class ClientLoginService {
	
	private ClientService clientService;

	public ClientLoginService(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	
	//TODO
}
