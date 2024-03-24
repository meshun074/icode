package com.fdmgroup.icode.physical.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.icode.physical.model.ContactInfo;

@Configuration
public class ContactData {

	@Bean("ci_client1")
	public ContactInfo info1() {
		ContactInfo contact = new ContactInfo();
		contact.setFirstName("Anne");
		contact.setLastName("Stark");
		contact.setEmail("anne.stark@gmail.com");
		contact.setNumber("972-321-7681");
		return contact;
	}
	
	@Bean("ci_client2")
	public ContactInfo info2() {
		ContactInfo contact = new ContactInfo();
		contact.setFirstName("John");
		contact.setLastName("Johnson");
		contact.setEmail("jj.33@gmail.com");
		contact.setNumber("280-532-7601");
		return contact;
	}
	
	@Bean("ci_client3")
	public ContactInfo info3() {
		ContactInfo contact = new ContactInfo();
		contact.setFirstName("Sammuel");
		contact.setLastName("Brown");
		contact.setEmail("sam.brown@aol.com");
		contact.setNumber("306-802-8716");
		return contact;
	}
	
	@Bean("ci_therapist1")
	public ContactInfo info4() {
		ContactInfo contact = new ContactInfo();
		contact.setFirstName("Ashley");
		contact.setLastName("Smith");
		contact.setEmail("ashley.smith@gmail.com");
		contact.setNumber("214-532-7678");
		return contact;
	}
	
	@Bean("ci_therapist2")
	public ContactInfo info5() {
		ContactInfo contact = new ContactInfo();
		contact.setFirstName("Blake");
		contact.setLastName("Arnold");
		contact.setEmail("blake.arnold@gmail.com");
		contact.setNumber("214-406-5459");
		return contact;
	}
}
