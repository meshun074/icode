package com.fdmgroup.icode.setup.toggle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToggleService {

	private Toggler toggler;
	private String javaAnswer = "javaAnswer";
	private String oopAnswer = "oopAnswer";
	private String solidAnswer = "solidAnswer";
	private String classAnswer = "classAnswer";
	private String interfaceAnswer = "interfaceAnswer";
	private String enumAnswer = "enumAnswer";
	private String springAnswer = "springAnswer";
	private String pillarAnswer = "pillarAnswer";
	private String encapAnswer = "encapAnswer";
	private String abstractAnswer = "abstractAnswer";
	private String inheritAnswer = "inheritAnswer";
	private String polyAnswer = "polyAnswer";
	private String expressAnswer = "expressAnswer";
	private String thymAnswer = "thymAnswer";
	private List<String> attributes = new ArrayList<>(Arrays.asList(javaAnswer,
			oopAnswer, solidAnswer, classAnswer, interfaceAnswer,
			enumAnswer, springAnswer, pillarAnswer, encapAnswer
			,abstractAnswer, inheritAnswer, polyAnswer, expressAnswer,
			thymAnswer));
	
	public ToggleService(Toggler toggler) {
		super();
		this.toggler = toggler;
	}

	public void setVariables() {
		toggler.setAttributes(attributes);
	}

	public void toggleJavaAnswer() {
		toggler.toggle(javaAnswer);
	}

	public void toggleOopAnswer() {
		toggler.toggle(oopAnswer);
	}
	
	public void toggleSolidAnswer() {
		toggler.toggle(solidAnswer);
	}

	public void toggleClassAnswer() {
		toggler.toggle(classAnswer);
	}
	
	public void toggleInterfaceAnswer() {
		toggler.toggle(interfaceAnswer);
	}

	public void toggleEnumAnswer() {
		toggler.toggle(enumAnswer);
	}
	
	public void toggleSpringAnswer() {
		toggler.toggle(springAnswer);
	}

	public void togglePillarAnswer() {
		toggler.toggle(pillarAnswer);		
	}

	public void toggleEncapAnswer() {
		toggler.toggle(encapAnswer);
	}

	public void toggleAbstractAnswer() {
		toggler.toggle(abstractAnswer);
	}

	public void toggleInheritAnswer() {
		toggler.toggle(inheritAnswer);
	}

	public void togglePolyAnswer() {
		toggler.toggle(polyAnswer);
	}

	public void toggleExpressAnswer() {
		toggler.toggle(expressAnswer);
	}

	public void toggleThymAnswer() {
		toggler.toggle(thymAnswer);
	}

}
