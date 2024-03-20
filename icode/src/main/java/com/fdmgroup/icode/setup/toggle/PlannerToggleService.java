package com.fdmgroup.icode.setup.toggle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlannerToggleService {
	
	private Toggler toggler;
	private String planner1 = "planner1";
	private String planner2 = "planner2";
	private String planner3 = "planner3";
	private String planner4 = "planner4";
	private String planner5 = "planner5";
	private String planner6 = "planner6";
	private String planner7 = "planner7";
	private String planner8 = "planner8";
	private String planner9 = "planner9";
	private String planner10 = "planner10";
	private String planner11 = "planner11";
	private String planner12 = "planner12";
	private String planner13 = "planner13";
	private String planner14 = "planner14";
	private String planner15 = "planner15";
	private String planner16 = "planner16";
	private String planner17 = "planner17";
	private String planner18 = "planner18";
	private String planner19 = "planner19";	
	private String planner20 = "planner20";
	private String planner21 = "planner21";	
	private String planner22 = "planner22";	
	private String planner23 = "planner23";
	
	private List<String> attributes = new ArrayList<>(
			Arrays.asList(planner1, planner2, planner3, planner4, planner5,
					planner6, planner7, planner8, planner9, planner10, planner11,
					planner12, planner13, planner14, planner15, planner16, planner17, 
					planner18, planner19, planner20, planner21, planner22, planner23));

	public PlannerToggleService(Toggler toggler) {
		super();
		this.toggler = toggler;
	}

	public void setVariables() {
		toggler.setAttributes(attributes);
	}

	public void togglePlanner1() {
		toggler.toggle(planner1);
	}
	
	public void togglePlanner2() {
		toggler.toggle(planner2);
	}
	
	public void togglePlanner3() {
		toggler.toggle(planner3);
	}
	
	public void togglePlanner4() {
		toggler.toggle(planner4);
	}
	
	public void togglePlanner5() {
		toggler.toggle(planner5);
	}
	
	public void togglePlanner6() {
		toggler.toggle(planner6);
	}
	
	public void togglePlanner7() {
		toggler.toggle(planner7);
	}
	
	public void togglePlanner8() {
		toggler.toggle(planner8);
	}
	
	public void togglePlanner9() {
		toggler.toggle(planner9);
	}
	
	public void togglePlanner10() {
		toggler.toggle(planner10);
	}
	
	public void togglePlanner11() {
		toggler.toggle(planner11);
	}
	
	public void togglePlanner12() {
		toggler.toggle(planner12);
	}
	
	public void togglePlanner13() {
		toggler.toggle(planner13);
	}
	
	public void togglePlanner14() {
		toggler.toggle(planner14);
	}
	
	public void togglePlanner15() {
		toggler.toggle(planner15);
	}
	
	public void togglePlanner16() {
		toggler.toggle(planner16);
	}
	
	public void togglePlanner17() {
		toggler.toggle(planner17);
	}
	
	public void togglePlanner18() {
		toggler.toggle(planner18);
	}
	
	public void togglePlanner19() {
		toggler.toggle(planner19);
	}
	
	public void togglePlanner20() {
		toggler.toggle(planner20);
	}
	
	public void togglePlanner21() {
		toggler.toggle(planner21);
	}
	
	public void togglePlanner22() {
		toggler.toggle(planner22);
	}
	
	public void togglePlanner23() {
		toggler.toggle(planner23);
	}
}
