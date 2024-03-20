package com.fdmgroup.icode.setup.toggle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/toggle")
public class ToggleController {
	
	private ToggleService toggleService;
	private String redirectToDemo = "redirect:/demo";

	public ToggleController(ToggleService answerService) {
		super();
		this.toggleService = answerService;
	}
	
	@GetMapping("/setup")
	public String setUpData() {
		toggleService.setVariables();
		return "demo/landing";
	}

	@GetMapping("/javaAnswer")
	public String toggleJavaAnswer() {
		toggleService.toggleJavaAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/oopAnswer")
	public String toggleOopAnswer() {
		toggleService.toggleOopAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/solidAnswer")
	public String toggleSolidAnswer() {
		toggleService.toggleSolidAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/classAnswer")
	public String toggleClassAnswer() {
		toggleService.toggleClassAnswer();
		return redirectToDemo;
	}
	
	
	@GetMapping("/interfaceAnswer")
	public String toggleInterfaceAnswer() {
		toggleService.toggleInterfaceAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/enumAnswer")
	public String toggleEnumAnswer() {
		toggleService.toggleEnumAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/springAnswer")
	public String toggleSpringAnswer() {
		toggleService.toggleSpringAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/pillarAnswer")
	public String togglePillarAnswer() {
		toggleService.togglePillarAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/encapAnswer")
	public String toggleEncapAnswer() {
		toggleService.toggleEncapAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/abstractAnswer")
	public String toggleAbstractAnswer() {
		toggleService.toggleAbstractAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/inheritAnswer")
	public String toggleInheritAnswer() {
		toggleService.toggleInheritAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/polyAnswer")
	public String togglePolyAnswer() {
		toggleService.togglePolyAnswer();
		return redirectToDemo;
	}
	
	@GetMapping("/expressAnswer")
	public String toggleExpressAnswer() {
		toggleService.toggleExpressAnswer();
		return redirectToDemo;
	}
		
	@GetMapping("/thymAnswer")
	public String toggleThymAnswer() {
		toggleService.toggleThymAnswer();
		return redirectToDemo;
	}
}
