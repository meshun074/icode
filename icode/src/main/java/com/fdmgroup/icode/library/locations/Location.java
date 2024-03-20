package com.fdmgroup.icode.library.locations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Location {
	
	private Long locationId;
	private String name;
	private String address;
	private String phoneNumber;
	
	private static Long nextId = 400000L;
	
	public Location() {
		this.locationId = generateUniqueId();
		
	}

	public Location(String name, String address, String phoneNumber) {
		this();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long id) {
		locationId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Long generateUniqueId() {
		nextId += 9;
		return nextId;
	}

	@Override
	public String toString() {
		return "Location [Id=" + locationId + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
