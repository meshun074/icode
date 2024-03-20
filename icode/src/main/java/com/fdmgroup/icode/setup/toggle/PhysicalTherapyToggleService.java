package com.fdmgroup.icode.setup.toggle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PhysicalTherapyToggleService {

	private Toggler toggler;
	private String physical1 = "physical1";
	private String physical2 = "physical2";
	private String physical3 = "physical3";
	private String physical4 = "physical4";
	private List<String> attributes = new ArrayList<>(Arrays.asList(
			physical1, physical2, physical3, physical4));
	
	public PhysicalTherapyToggleService(Toggler toggler) {
		super();
		this.toggler = toggler;
	}

	public void setVariables() {
		toggler.setAttributes(attributes);
	}
	
	public void togglePhysicalTherapist() {
		toggler.toggle(physical1);
	}

	public void togglePhysicalTherapyClient() {
		toggler.toggle(physical2);
	}

	public void toggleExercises() {
		toggler.toggle(physical3);
	}

	public void toggleAssignments() {
		toggler.toggle(physical4);
	}
}
