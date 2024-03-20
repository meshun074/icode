package com.fdmgroup.icode.demo.trails;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Trail {

	private long id;
	private String name;
	private String location;
	private String activity;
	private boolean petsAllowed;
	
	public Trail() {
		super();
	}
	public Trail(long id, String name, String location, String activity, boolean petsAllowed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.activity = activity;
		this.petsAllowed = petsAllowed;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public boolean isPetsAllowed() {
		return petsAllowed;
	}
	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}
	@Override
	public String toString() {
		return "Trail [id=" + id + ", name=" + name + ", location=" + location + ", activity=" + activity
				+ ", petsAllowed=" + petsAllowed + "]";
	}
	
}
